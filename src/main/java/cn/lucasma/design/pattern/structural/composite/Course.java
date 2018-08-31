package cn.lucasma.design.pattern.structural.composite;

/**
 * Author: lucasma
 */
public class Course extends CatalogComponent {

    private String name;
    private double price;

    // 构造器
    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // 重写抽象类的方法
    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public double getPrice(CatalogComponent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("Course Name:"+name+" Price:"+price);
    }
}
