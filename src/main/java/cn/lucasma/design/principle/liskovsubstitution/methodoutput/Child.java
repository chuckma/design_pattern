package cn.lucasma.design.principle.liskovsubstitution.methodoutput;

import java.util.HashMap;

/**
 * @author Administrator
 *
 *  子类在实现父类抽象方法时，返回值一定要小于等于父类的方法返回值
 */
public class Child extends Base {
    @Override
    public HashMap method() {
        HashMap hashMap = new HashMap();
        System.out.println("子类 method 被执行");
        hashMap.put("msg", "子类method 被执行");
        return hashMap;
    }
}
