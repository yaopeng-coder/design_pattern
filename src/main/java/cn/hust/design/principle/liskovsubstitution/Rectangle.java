package cn.hust.design.principle.liskovsubstitution;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-03 20:53
 **/
public class Rectangle implements Quadrangle {
    private int length;
    private int width;

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public int getWidth() {
        return width;
    }
}
