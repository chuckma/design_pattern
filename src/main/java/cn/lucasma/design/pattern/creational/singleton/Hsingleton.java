package cn.lucasma.design.pattern.creational.singleton;

/**
 * @author mcg
 * @date 2021/4/11 09:27
 *
 * 饿汉式,一来就要
 **/

public class Hsingleton {


  private final static Hsingleton instance;

  static {
    instance = new Hsingleton();
  }

  private Hsingleton() {
  }

  public static Hsingleton getInstance() {
    return instance;
  }
}
