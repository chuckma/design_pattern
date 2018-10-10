package cn.lucasma.design.pattern.behavioral.observer.guavatest;

/**
 * Created by lucasma
 */
public class LogEvent {

    private  String msg;

    public LogEvent(String msg) {
        this.msg = msg;
//        System.out.println("event message:"+msg);

    }

    public String getMsg() {
        return msg;
    }
}
