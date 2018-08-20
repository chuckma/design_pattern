package cn.lucasma.design.pattern.creational.singleton;

/**
 * Created by
 *
 *
 *      单例静态内部类，基于类初始化的延迟加载解决方案，
 *      核心在于 InnerClass 这个类的对象的初始化锁哪个线程拿到，哪个线程就去初始化它。
 *
 *
 * jvm 在类的初始化阶段（class 被加载后被线程使用之前），
 * 在这个期间 jmv 会去获取一个锁，这个锁会同步多个线程对一个类的初始化
 * 这个特性我们可以说基于类初始化的延迟加载解决方案
 *
 * 线程 0 ----                                --------------------------
 *           |                               |   1.分配内存空间         |
 *            --->  class对象的初始化锁------> |  * 3.设置instance 指向内存|
 *           |                               |   * 2.初始化对象           |
 * 线程 1 ----                                |                        |
 *                                            -------------------------
 *
 * 线程1 看不到线程 0 重排序的，非构造线程是看不到的。（之前是线程0来构造单例的）
 *
 *
 * 初始化一个类，包括执行这个类的静态初始化， 初始化这个类中申明的静态变量
 * 根据Java语言规范，首次发生的时候，一个类将被初始化
 * eg. A 类 ,下面这几种情况会导致A类被创建
 * 1.  有一个A类型的实例被创建
 * 2.  A类中申明的静态方法被调用
 * 3. A类中申明的静态成员被赋值
 * 4. A类中申明的静态成员被使用，并且这个成员不是常量成员
 * 5. A类是一个顶级类，并且A类中有嵌套的断言语句
 *
 *
 */
public class StaticInnerClassSingleton {
    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }
    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }
    private StaticInnerClassSingleton(){
        if(InnerClass.staticInnerClassSingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }


}
