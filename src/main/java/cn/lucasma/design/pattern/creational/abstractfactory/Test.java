package cn.lucasma.design.pattern.creational.abstractfactory;

/**
 * Author: lucasma
 */
public class Test {


    public static void main(String[] args) {

        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();
    }
}
