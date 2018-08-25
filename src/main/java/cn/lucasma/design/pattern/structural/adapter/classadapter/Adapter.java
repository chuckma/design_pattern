package cn.lucasma.design.pattern.structural.adapter.classadapter;

/**
 * Author: lucasma
 */
public class Adapter extends Adaptee implements Target {


    @Override
    public void reuqest() {
        super.adapteeRequest();
    }
}
