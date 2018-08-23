package cn.lucasma.design.pattern.creational.singleton;

/**
 * Created by lucas
 */
public class T implements Runnable {
    @Override
    public void run() {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
//        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();;

//        ContainerSingleton.putInstance("object",new Object());
//        Object instance = ContainerSingleton.getInstance("object");
//        ThreadLocalInstance instance = ThreadLocalInstance.getInstance();

        UUIDUtil instance = UUIDUtil.getInstance();
        System.out.println(Thread.currentThread().getName()+"  "+instance);

    }
}
