package cn.lucasma.design.pattern.creational.simplefactory;

/**
 * @author Administrator
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java视频课程");
    }
}
