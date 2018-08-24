package cn.lucasma.design.pattern.structural.decorator.v2;

/**
 * Created by lucas
 *
 *
 * 定义：在不改变原有对象的基础之上，将功能附加到对象之上。
 *
 * 补充定义： 提供了比继承更具有弹性的替代方案（推展原有对象的功能）
 *
 * 类型：结构性
 *
 * 适用场景：
 * 1. 扩展一个类的功能或者给类添加职责
 * 2. 动态的给一个类添加功能，这些功能也可以动态的撤销
 *
 * 优点：
 * 1. 是对继承的有力补充，比继承灵活，在不改变原有对象的情况下个一个对象扩展功能
 * 2. 通过使用不同的装饰类和这些装饰类的排列组合，可以实现不同的效果。
 * 3. 符合开闭原则。
 *
 * 在程序体现上，是把类的装饰功能从类中移除出去，这样简化了被装饰的类，简化了被装饰的类
 *
 * 缺点：
 * 1. 会出现更多的代码，更多的类，增加程序的复杂性
 * 2. 动态装饰，多层装饰时候，会使得程序更为复杂
 */
public class Test {
    public static void main(String[] args) {
        ABattercake aBattercake;
        aBattercake = new Battercake();
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);

        System.out.println(aBattercake.getDesc()+" :"+aBattercake.cost());

    }
}
