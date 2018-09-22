package cn.lucasma.design.pattern.behavioral.templatemethod;


/**
 * Created by lucasma
 */
public class FeCourse extends ACourse {
    private boolean needWriteArticleFlag = false;

    @Override
    void packageCourse() {
        System.out.println("提供课程前端代码");
        System.out.println("提供课程图片素材");
    }

    public FeCourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    @Override
    protected boolean neewWriteArticle() {
        return this.needWriteArticleFlag;
    }
}