package cn.lucasma.design.pattern.structural.proxy.my;

/**
 * @author mcg
 *
 * 客户端来方位代理对象,请代理对象处理被代理对象的事情
 **/

public class Client {

  public static void main(String[] args) {

    // 房东要出租房子
    LandLord landLord = new LandLord();
    // 中介帮房东出租房子,
    HouseProxy houseProxy = new HouseProxy(landLord);
    // 你直接找中介租
    landLord.rentHoust();

  }
}
