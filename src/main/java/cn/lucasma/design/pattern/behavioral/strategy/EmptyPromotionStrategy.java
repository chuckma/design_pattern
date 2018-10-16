package cn.lucasma.design.pattern.behavioral.strategy;

/**
 * Created by lucasma
 */
public class EmptyPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
