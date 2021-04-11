package cn.lucasma.design.pattern.structural.proxy.my;

/**
 * @author mcg
 *
 * 代理模式中的代理对象,它来代理真实的对象
 * 代理对象提供给客户端类访问
 **/

public class HouseProxy {

  public LandLord landLord;

  public HouseProxy(LandLord landLord) {
    this.landLord = landLord;
  }

}
