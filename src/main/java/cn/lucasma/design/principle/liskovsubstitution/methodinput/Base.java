package cn.lucasma.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

/**
 * @author Administrator
 */
public class Base {

    public void method(HashMap map) {
        System.out.println("父类被执行");
    }
}
