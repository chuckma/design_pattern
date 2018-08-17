package cn.lucasma.design.pattern.creational.factorymethod;


/**
 * @author Administrator
 */
public class FeVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制前端视频课程");
    }
}
