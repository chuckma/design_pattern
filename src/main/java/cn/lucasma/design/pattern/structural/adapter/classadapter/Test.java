package cn.lucasma.design.pattern.structural.adapter.classadapter;


/**
 * Author: lucasma
 *
 * 适配器模式
 *
 * 定义： 将一个类的接口转换成客户希望的另外一个接口
 * 使原本接口不兼容的类可以一起工作
 *
 * 类型： 结构性
 *
 * 适用场景：
 * 1.已经存在的类，他的方法和需求不匹配时（方法结果相同或者相似）
 * 2.不是软件设计阶段考虑的设计模式，是随着软件维护，由于不同产品，不同厂家造成功能类似儿接口不同情况下的解决方案
 *
 * 所以说，软件设计阶段不用考虑适配
 *
 *
 * 优点：
 * 1. 能提高类的透明性和复用，现有类复用但不需要改变
 * 2. 目标类和适配器类解耦，提高程序扩展性
 * 3. 符合开闭原则
 *
 * 缺点：
 * 1. 适配器编写过程需要全面的考虑，可能会增加系统的复杂性
 * 2. 增加系统代码的可读性
 *
 * 扩展：
 * 对象适配器 通过组合实现
 *
 * 类适配器 通过继承实现
 *
 * 相关的设计模式：适配器模式和外观模式
 *
 * 适配器和外观都是对现存系统的封装，外观定义了新的接口，而适配器复用原有的接口。
 * 适配器是和原有的接口系统工作，而外观是为系统提供一个方便的访问入口。
 *
 *
 *
 */
public class Test {


    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.reuqest();
        Target adaperTarget = new Adapter();
        adaperTarget.reuqest();
    }
}
