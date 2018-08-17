package cn.lucasma.design.pattern.creational.factorymethod;

/**
 * @author Administrator
 *
 *
 * java的视频，java 的手记，属于同一产品族
 * java视频 ，python视频，前端视频，属于同一产品等级
 * java手记，python手记，前端手记，属于同一产品等级
 *
 *
 * 抽象工厂解决产品族的问题；
 */
public class Test {


    public static void main(String[] args) {
        VideoFactory javafactory = new JavaVideoFactory();
        VideoFactory pythonfactory = new PythonVideoFactory();
        VideoFactory fefactory = new FeVideoFactory();

        Video javafactoryVideo = javafactory.getVideo();
//        Video pythonfactoryVideo = pythonfactory.getVideo();
//        Video fefactoryVideo = fefactory.getVideo();
        javafactoryVideo.produce();
//        pythonfactoryVideo.produce();
//        fefactoryVideo.produce();


    }
}
