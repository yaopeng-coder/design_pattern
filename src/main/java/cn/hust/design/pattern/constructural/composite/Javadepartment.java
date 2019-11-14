package cn.hust.design.pattern.constructural.composite;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-14 19:40
 **/
public class Javadepartment extends Company{


    public Javadepartment(String name) {
        super(name);
    }

    @Override
    public void display(Company company) {
        System.out.println("");
    }

    @Override
    public void print() {
        System.out.println(this.getName());
    }
}
