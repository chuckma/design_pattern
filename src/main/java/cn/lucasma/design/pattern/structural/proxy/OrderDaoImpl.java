package cn.lucasma.design.pattern.structural.proxy;

/**
 * Created by lucasma
 */
public class OrderDaoImpl implements IOrderDao {
    @Override
    public int insert(Order order) {
        System.out.println("插入order 成功");
        return 1;
    }
}
