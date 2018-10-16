package cn.lucasma.design.pattern.behavioral.strategy;

/**
 * Created by lucasma
 */
public class PromotionActivity {


    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotionStrategy(){
        promotionStrategy.doPromotion();
    }
}
