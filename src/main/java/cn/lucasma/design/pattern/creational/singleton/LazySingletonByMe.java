package cn.lucasma.design.pattern.creational.singleton;

/**
 * @author mcg
 * @date 2021/4/11 09:33
 **/

public class LazySingletonByMe {


  private static LazySingletonByMe instance = null;

  private LazySingletonByMe() {
  }

  public static LazySingletonByMe getInstance() {
    if (instance == null) {
      synchronized (LazySingletonByMe.class) {
        if (instance == null) {
          instance = new LazySingletonByMe();
        }
      }
    }
    return instance;
  }

}
