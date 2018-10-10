package cn.lucasma.design.pattern.behavioral.observer;

import java.util.Observable;

/**
 * Created by lucasma
 *
 * 被观察者
 */
public class Course extends Observable {

    private String couseName;

    public Course(String couseName) {
        this.couseName = couseName;
    }

    public String getCouseName() {
        return couseName;
    }


    public void produceQuestion(Course course, Question question) {
        System.out.println(question.getUserName() + "在" + course.getCouseName() + "提交了一个问题");
        setChanged();
        notifyObservers(question);
    }
}
