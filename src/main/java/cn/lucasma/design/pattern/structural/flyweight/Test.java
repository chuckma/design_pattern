package cn.lucasma.design.pattern.structural.flyweight;

/**
 * Author: lucasma
 *
 *
 * 定义: 提供了减少对象数量从而改善应用所需的对象结构的方式
 *
 * 补充定义：运用共享技术有效支持大量细粒度的对象
 *
 * 类型：结构型
 *
 * 一句话说，就是减少对象创建的数量，从而减少内存的占用，提高性能
 *
 * 适用场景：
 * 1. 系统底层开发，以便解决系统的性能问题。eg. java 中的String 类型，数据库的连接池
 * 2. 系统有大量的相似对象，需要缓冲池的场景。
 *
 * 优点：
 * 1. 减少对象的创建，降低系统内存，提高效率
 * 2. 减少系统之外的其他资源的占用 eg. 创建对象的时间
 *
 * 缺点：
 * 1. 关注内外部状态，关注线程安全问题
 * 2. 使得系统的逻辑复杂化
 *
 */
public class Test {


    private static final String departments[] = {"RD","QA","PM","BD"};

    public static void main(String[] args) {
        /*for(int i=0; i<10; i++){
            String department = departments[(int)(Math.random() * departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();

        }*/
        Integer a = Integer.valueOf(100);
        Integer b = 100;

        Integer c = Integer.valueOf(1000);
        Integer d = 1000;

        System.out.println("a==b:"+(a==b));

        System.out.println("c==d:"+(c==d));

    }
}
