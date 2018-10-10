package cn.lucasma.design.pattern.behavioral.observer.guavatest;

import com.google.common.eventbus.EventBus;

/**
 * Created by lucasma
 */
public class LogEventTest {
    public static void main(String[] args) {


        EventBus eventBus = new EventBus();

        LogListener logListener = new LogListener();

        eventBus.register(logListener);

        eventBus.post(new LogEvent("测试1"));
        eventBus.post(new LogEvent("测试2"));
        eventBus.post(new LogEvent("测试3"));
        eventBus.post(new LogEvent("测试4"));

        System.out.println(logListener.getMsg());

    }

}
