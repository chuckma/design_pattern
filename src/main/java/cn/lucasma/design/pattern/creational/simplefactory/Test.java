package cn.lucasma.design.pattern.creational.simplefactory;

import org.codehaus.jackson.annotate.JsonValue;

/**
 * @author Administrator
 *
 * 应用层代码
 */
public class Test{
    public static void main(String[] args) {
//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
//        if (video == null) {
//            return;
//        }
//        video.produce();

        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if (video == null) {
            return;
        }
        video.produce();
    }
}
