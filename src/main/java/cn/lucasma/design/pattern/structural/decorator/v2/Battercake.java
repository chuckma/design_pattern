package cn.lucasma.design.pattern.structural.decorator.v2;

/**
 * Created by lucas
 *
 * 具体的被装饰者实体，继承抽象被装饰者
 */
public class Battercake extends ABattercake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
