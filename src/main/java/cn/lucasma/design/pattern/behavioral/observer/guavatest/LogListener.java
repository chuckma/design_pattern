package cn.lucasma.design.pattern.behavioral.observer.guavatest;

import com.google.common.eventbus.Subscribe;

/**
 * Created by lucasma
 */
public class LogListener {

    public String msg;

    @Subscribe
    public void listen(LogEvent event) {
        msg = event.getMsg();
        System.out.println("Message:" + msg);
    }

    public String getMsg() {
        return msg;
    }
}

