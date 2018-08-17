package cn.lucasma.design.pattern.creational.factorymethod;

/**
 * @author Administrator
 */
public class FeVideoFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new FeVideo();
    }
}
