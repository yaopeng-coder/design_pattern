package cn.hust.design.principle.openclose;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-03 15:28
 **/
public class JavaCourse implements ICourse {

    private Integer id;
    private String name;
    private double price;


    public JavaCourse(Integer id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

}
