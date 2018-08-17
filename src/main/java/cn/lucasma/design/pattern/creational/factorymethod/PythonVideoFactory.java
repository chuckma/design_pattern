package cn.lucasma.design.pattern.creational.factorymethod;

/**
 * @author Administrator
 */
public class PythonVideoFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
