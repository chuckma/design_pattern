package cn.lucasma.design.pattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by lucasma
 *
 * 观察者
 */
public class Teacher implements Observer {

    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }


    @Override
    public void update(Observable o, Object arg) {
        //  o 被观察的对象 ， arg 是 notifyObservers 传来的参数
        Course course = (Course) o;
        Question question = (Question) arg;

        System.out.println(teacherName + "老师的" + course.getCouseName() + "课程接受到一个" + question.getUserName() + "提交的问答" + question.getQusetionContent());
    }
}
