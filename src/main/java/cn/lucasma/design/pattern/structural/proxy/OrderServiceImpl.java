package cn.lucasma.design.pattern.structural.proxy;

/**
 * Created by lucasma
 */
public class OrderServiceImpl implements IOrderService {


    private IOrderDao iOrderDao;

    @Override
    public int saveOrder(Order order) {
        // spring 会 直接注入 ，这里就直接new 一个
        iOrderDao = new OrderDaoImpl();
        System.out.println("service 层调用 dao 层 添加 order");
        return iOrderDao.insert(order);
    }
}
