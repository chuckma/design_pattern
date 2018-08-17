package cn.lucasma.design.pattern.creational.factorymethod;


/**
 * @author Administrator
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python视频课程");
    }
}
