package cn.lucasma.design.pattern.creational.factorymethod;

/**
 * @author Administrator
 */
public class JavaVideoFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
