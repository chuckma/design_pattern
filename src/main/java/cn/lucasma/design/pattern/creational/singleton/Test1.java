package cn.lucasma.design.pattern.creational.singleton;

/**
 * @author Administrator
 */
public class Test1 {


    public static void main(String[] args) {
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("program end");
        System.out.println(UUIDUtil.getInstance());
        System.out.println(UUIDUtil.getUuid());
    }
}
