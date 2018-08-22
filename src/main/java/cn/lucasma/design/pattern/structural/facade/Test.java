package cn.lucasma.design.pattern.structural.facade;

/**
 * Created by lucas
 *
 *
 * 外观模式  封装调用，简化交互
 *
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.open();
        System.out.println("玩一会电脑");
        computer.close();
    }
}
