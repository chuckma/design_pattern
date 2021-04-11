package cn.lucasma.design.pattern.structural.proxy.my.dynamic;

import cn.lucasma.design.pattern.structural.proxy.my.LandLord;
import cn.lucasma.design.pattern.structural.proxy.my.Rent;

import java.lang.reflect.Proxy;

/**
 * @author mcg
 *
 * 动态代理 客户端 测试 JDK 动态代理
 **/

public class Client2 {


  public static void main(String[] args) {
    // 真实的角色
    LandLord landLord = new LandLord();
    ProxyInvocationHandler pih = new ProxyInvocationHandler();
    pih.setTarget(landLord); // 设置要代理的对象

    // 动态生成代理类
    Rent rent = (Rent) pih.getProxy();
    rent.rentHoust();

  }

}
