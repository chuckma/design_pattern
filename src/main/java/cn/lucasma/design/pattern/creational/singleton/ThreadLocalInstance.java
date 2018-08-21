package cn.lucasma.design.pattern.creational.singleton;

/**
 * @author Administrator
 * <p>
 * ThreadLocal 线程隔离
 * 为每一个线程提供一个独立的变量副本
 * 为每个线程提供一个访问对象
 * 基于 ThreadLocalMap 实现，隔离了多个线程对数据的访问冲突
 * ThreadLocal 用空间换时间，它会创建很多的对象
 */
public class ThreadLocalInstance {

    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstance
            = new ThreadLocal<ThreadLocalInstance>() {
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };

    private ThreadLocalInstance() {

    }

    public static ThreadLocalInstance getInstance() {
        return threadLocalInstance.get();
    }
}
