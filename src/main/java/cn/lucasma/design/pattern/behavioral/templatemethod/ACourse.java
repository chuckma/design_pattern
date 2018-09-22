package cn.lucasma.design.pattern.behavioral.templatemethod;

/**
 * Created by lucasma
 *
 *
 * 场景： 制作教学课程，每个教学课程都需要:
 * 1.制作ppt(固定不变)
 * 2.制作视频
 * 3.写手记
 */
public abstract class ACourse {

    // 不想被修改 子类覆盖
    protected final void makeCourse() {
        this.makePPT();
        this.makeVideo();
        if (neewWriteArticle()) {
            this.makeArticle();
        }
        this.packageCourse();
    }

    final void makePPT() {
        System.out.println("制作PPT");
    }

    final void makeVideo() {
        System.out.println("制作视频");
    }
    final void makeArticle() {
        System.out.println("编写手记");
    }

    // 钩子方法     使得子类更进一步的开放和扩展
    protected boolean neewWriteArticle() {
        return false;
    }

    abstract void packageCourse();
}
