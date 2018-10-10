package cn.lucasma.design.pattern.behavioral.observer;

/**
 * Created by lucasma
 */
public class Test {


    public static void main(String[] args) {
        Course course = new Course("java 设计模式");
        Teacher teacher = new Teacher("geely");

        course.addObserver(teacher); // 添加一个观察者

        // 逻辑代码

        Question question = new Question();
        question.setUserName("lucas ma ");
        question.setQusetionContent("观察者模式的应用场景");

        course.produceQuestion(course, question);
    }


}
