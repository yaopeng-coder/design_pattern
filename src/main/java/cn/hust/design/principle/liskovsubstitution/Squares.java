package cn.hust.design.principle.liskovsubstitution;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-03 20:54
 **/
public class Squares implements Quadrangle {
    private int sideLength;

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public int getLength() {
        return getSideLength();
    }

    @Override
    public int getWidth() {
        return getSideLength();
    }
}
