package cn.lucasma.design.pattern.creational.prototype.abstractprototype;

/**
 * Created by lucas
 */
public abstract class A implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
