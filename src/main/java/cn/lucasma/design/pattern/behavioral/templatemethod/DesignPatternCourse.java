package cn.lucasma.design.pattern.behavioral.templatemethod;

/**
 * Created by lucasma
 */
public class DesignPatternCourse extends ACourse {
    @Override
    void packageCourse() {
        System.out.println("提供 设计模式 课程 源代码");
    }

    @Override
    protected boolean neewWriteArticle() {
        return true;
    }
}
