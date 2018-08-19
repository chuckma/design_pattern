package cn.lucasma.design.pattern.creational.abstractfactory;

/**
 * Author: lucasma
 *
 * 产品族
 */
public class PythonCourseFactory implements CourseFactory {

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
