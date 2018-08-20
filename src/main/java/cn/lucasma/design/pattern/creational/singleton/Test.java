package cn.lucasma.design.pattern.creational.singleton;

/**
 * Author: lucasma
 */
public class Test {

    public static void main(String[] args) {
//        LazySingleton lazySingleton = LazySingleton.getInstance();

        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("program end");
    }
}
