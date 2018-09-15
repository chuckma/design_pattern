package cn.lucasma.design.pattern.structural.proxy.staticproxy;

import cn.lucasma.design.pattern.structural.proxy.IOrderService;
import cn.lucasma.design.pattern.structural.proxy.Order;
import cn.lucasma.design.pattern.structural.proxy.OrderServiceImpl;
import cn.lucasma.design.pattern.structural.proxy.db.DataSourceContextHolder;

/**
 * Created by lucasma
 */
public class OrderServiceStaticProxy {

    private IOrderService iOrderService; // 目标对象，对象目标对象方法进行增强

    public int saveOrder(Order order) {
        beforeMethod(order);
        iOrderService = new OrderServiceImpl();
        int res = iOrderService.saveOrder(order);
        afterMethod();
        return res;
    }


    private void beforeMethod(Order order) {
        iOrderService = new OrderServiceImpl();
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到 【db" + dbRouter + "】处理数据");

        // 设置 DataSource
        DataSourceContextHolder.setDBType("db"+String.valueOf(dbRouter));

        System.out.println("静态代理 before code");
    }

    private void afterMethod() {
        System.out.println("静态代理 after code");
    }

}
