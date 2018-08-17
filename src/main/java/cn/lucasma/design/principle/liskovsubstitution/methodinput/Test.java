package cn.lucasma.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

/**
 * @author Administrator
 */
public class Test {

    public static void main(String[] args) {
        Child child = new Child();
        HashMap hashMap = new HashMap();
        child.method(hashMap);

    }
}
