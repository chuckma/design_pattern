package cn.lucasma.design.pattern.structural.proxy.my.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author mcg
 **/

public class ProxyInvocationHandler implements InvocationHandler {



  // 被代理的对象
  private Object target;

  public void setTarget(Object target) {
    this.target = target;
  }


  /**
   * 生成得到代理类
   * @return 得到一个代理类
   */
  public Object getProxy() {
    return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
  }


  /**
   * 处理代理实例,返回结果
   * @param proxy
   * @param method
   * @param args
   * @return
   * @throws Throwable
   */
  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    Object invoke = method.invoke(target, args);
    return invoke;
  }
}
