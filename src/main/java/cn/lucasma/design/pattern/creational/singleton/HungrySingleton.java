package cn.lucasma.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * @author lucas
 * <p>
 * Hungry singleton 写法简单，类加载就初始化了
 * 避免了多线程同步问题，但是因为一开始就是加载好的
 * 没有延迟加载的效果
 * 如果这个类没有使用，就造成了内存的浪费。
 */
public class HungrySingleton implements Serializable,Cloneable{

    /**
     * 类加载的时候就完成实例化 final 使得类不可更改
     */
    private final static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    // 私有构造器
    private HungrySingleton() {
        // 反射防御 这种方式适用于 1.类加载的时候就把对象实例化的 类是可以的；2.单例静态内部类

        if (hungrySingleton != null) {
            throw new RuntimeException("单利构造器禁止反射调用！");
        }
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    /**
     * 序列化和反序列化 之后的对象不是同一个对象，下面这个方法可以解决这个问题
     * @return
     */
    private Object readResolve() {
        return hungrySingleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 对于原型模式通过clone 破坏单例的解决方式是
        // 1单例类不实现 Cloneable 接口；2 如果实现了，那么重写 clone 方法 ，返回 单例对象，不在让其进行clone  操作。
        return getInstance();
    }
}
