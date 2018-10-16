package cn.lucasma.design.pattern.behavioral.strategy;

/**
 * Created by lucasma
 */
public class ManJianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("满减促销,满200-20元");
    }
}
