package cn.lucasma.design.pattern.creational.builder;

/**
 * @author Administrator
 *
 * 如果都是抽象方法需要实现的话，也可以使用 interface 创建 Builder
 */
public abstract class Builder {

    public abstract void buildCPU(String cpu);
    public abstract void buildMainBoard(String mainBoard);
    public abstract void buildHardDisk(String hardDisk);
    public abstract void buildDisplayCard(String displayCard);
    public abstract void buildPower(String power);
    public abstract void buildMemory(String memory);

    public abstract Computer createComputer();

}
