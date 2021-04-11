package cn.lucasma.design.pattern.creational.singleton;

/**
 * @author Administrator
 */
public class Test1 {


    public static void main(String[] args) {

      Hsingleton instance = Hsingleton.getInstance();
      Hsingleton instance2 = Hsingleton.getInstance();
      System.out.println(instance);
      System.out.println(instance2);
    }
}
