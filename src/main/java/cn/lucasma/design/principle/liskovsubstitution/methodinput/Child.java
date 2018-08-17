package cn.lucasma.design.principle.liskovsubstitution.methodinput;

import java.util.Map;

/**
 * @author Administrator
 *
 * 子类在重载父类的方法时，方法的前置条件，一定要比父类方法的入参更宽松
 */
public class Child extends Base {

//    @Override
//    public void method(HashMap map) {
//        System.out.println("子类HashMap 入参被执行");
//    }

    public void method(Map map) {
        System.out.println("子类Map 入参被执行");
    }
}
