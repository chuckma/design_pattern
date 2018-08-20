package cn.lucasma.design.pattern.creational.singleton;

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

    private LazySingleton() {

    }

    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
