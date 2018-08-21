package cn.lucasma.design.pattern.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * Author: lucasma
 * <p>
 * 懒汉模式 多线程情况下会new 出很多 单例类型的对象
 *
 * 同步锁比较消耗资源，加锁解锁开销大，
 * synchronize 修饰 static 方法的时候，是对整个 class 上锁，范围太大，影响性能
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;
    private static boolean flag= true;
    private LazySingleton() {
        // 这里加任何复杂的逻辑都是无法抵挡反射攻击
        if (flag) {
            flag = false;
        } else {
            throw new RuntimeException("单利构造器禁止反射调用！");
        }
    }

    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        // 通过这个反射破坏懒加载单例，在私有构造器中加任何复杂的逻辑都会被反射破坏
        Class clazz = LazySingleton.class;
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        LazySingleton o1 = LazySingleton.getInstance();

        Field field = o1.getClass().getDeclaredField("flag");
        field.setAccessible(true);
        field.set(o1, true);
        LazySingleton o2 = (LazySingleton) constructor.newInstance();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o1 == o2);
    }
}
