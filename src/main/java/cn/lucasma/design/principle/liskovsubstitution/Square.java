package cn.lucasma.design.principle.liskovsubstitution;

/**
 * @author Administrator
 */
public class Square implements Quadrangle {

    private long sideLength;


    @Override
    public long getWidth() {
        return sideLength;
    }

    @Override
    public long getLength() {
        return sideLength;
    }

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }
}
