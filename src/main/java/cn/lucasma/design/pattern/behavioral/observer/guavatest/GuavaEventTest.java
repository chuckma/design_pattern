package cn.lucasma.design.pattern.behavioral.observer.guavatest;

import com.google.common.eventbus.EventBus;

/**
 * Created by lucasma
 */
public class GuavaEventTest {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();  // 被观察者
        GuavaEvent guavaEvent = new GuavaEvent();  // 观察者
        eventBus.register(guavaEvent); // 注册观察者
        eventBus.post("测试 guava 观察者");
    }
}
