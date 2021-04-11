package cn.lucasma.design.pattern.structural.proxy.my;

/**
 * @author mcg
 * <p>
 * 房东,有出租房子的需求
 * 代理模式中的真是代理对象 ,它是被代理的
 **/

public class LandLord implements Rent {


  @Override
  public void rentHoust() {
    System.out.println("房东要出租房子");
  }
}
