package cn.lucasma.design.pattern.creational.singleton;

/**
 * @author lucas
 * <p>
 * Hungry singleton 写法简单，类加载就初始化了
 * 避免了多线程同步问题，但是因为一开始就是加载好的
 * 没有延迟加载的效果
 * 如果这个类没有使用，就造成了内存的浪费。
 */
public class HungrySingleton {

    //类加载的时候就完成实例化 final 使得类不可更改
    private final static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    // 私有构造器
    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
