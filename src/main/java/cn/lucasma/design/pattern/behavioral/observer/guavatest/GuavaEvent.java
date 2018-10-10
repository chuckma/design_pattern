package cn.lucasma.design.pattern.behavioral.observer.guavatest;

import com.google.common.eventbus.Subscribe;

/**
 * Created by lucasma
 */
public class GuavaEvent {

    @Subscribe
    public void subscribe(String str) {
        // 业务逻辑
        System.out.println("执行 subscribe 方法，传入参数 ：" + str);
    }
}
