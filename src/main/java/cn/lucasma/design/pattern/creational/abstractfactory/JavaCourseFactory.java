package cn.lucasma.design.pattern.creational.abstractfactory;

/**
 * Author: lucasma
 *
 * 产品族
 */
public class JavaCourseFactory implements CourseFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
