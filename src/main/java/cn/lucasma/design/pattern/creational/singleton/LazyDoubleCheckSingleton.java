package cn.lucasma.design.pattern.creational.singleton;

/**
 * Author: lucasma
 *
 * 懒汉 双重检查 单例
 *
 * 重排序这里，线程0
 * 1 .分配对象的内存空间
 * 2 .初始化对象
 * 3 .设置instance 指向内存空间
 * 4 .初次访问对象
 * 但是重排序可能使得 步骤3在步骤2之前执行，那么当 线程1 访问时，由于线程0已经指向了内存空间，接着就要访问对象了，
 * 但是线程0又没有初始化出对象，系统就出异常了。
 *
 * 对于这种情况， 线程0访问对象是不影响的，虽然进行了重排序，线程1就不一样了。
 *
 * 上面的问题的解决方式是什么呢？
 * 1. 对线程0禁止重排序 （使用 volatile 关键字，多线程的时候 cpu 也有共享内存，加了 volatile 之后，所有的线程都能看到内存状态 ）
 * 2. 允许线程0重排序，但是不能让线程1知道
 */
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton() {

    }

    public  static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    //1.分配内存给这个对象
//                  //3.设置lazyDoubleCheckSingleton 指向刚分配的内存地址
                    //2.初始化对象
//                    intra-thread semantics
//                    ---------------//3.设置lazyDoubleCheckSingleton 指向刚分配的内存地址
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
