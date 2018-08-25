package cn.lucasma.design.pattern.structural.adapter.classadapter;

/**
 * Author: lucasma
 */
public class ConcreteTarget implements Target {
    @Override
    public void reuqest() {
        System.out.println("ConcreteTarget 目标方法");
    }
}
