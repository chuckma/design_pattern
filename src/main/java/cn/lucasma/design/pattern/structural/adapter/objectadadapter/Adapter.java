package cn.lucasma.design.pattern.structural.adapter.objectadadapter;


/**
 * Author: lucasma
 */
public class Adapter implements Target {

    private Adaptee adaptee = new Adaptee();


    @Override
    public void reuqest() {

        adaptee.adapteeRequest();
    }
}
