package cn.lucasma.design.pattern.structural.proxy.staticproxy;


import cn.lucasma.design.pattern.structural.proxy.IOrderService;
import cn.lucasma.design.pattern.structural.proxy.Order;
import cn.lucasma.design.pattern.structural.proxy.OrderServiceImpl;
import cn.lucasma.design.pattern.structural.proxy.dynamicproxy.OrderServiceDynamicProxy;

/**
 * Created by geely
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
//        order.setUserId(2);
        order.setUserId(2);
        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();

        orderServiceStaticProxy.saveOrder(order);
    }
}
