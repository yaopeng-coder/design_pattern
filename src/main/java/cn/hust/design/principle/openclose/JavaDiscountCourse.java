package cn.hust.design.principle.openclose;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-03 15:35
 **/
public class JavaDiscountCourse implements ICourse{

    private ICourse iCourse;

    private double discount;

    public JavaDiscountCourse(ICourse iCourse, double discount) {
        this.iCourse = iCourse;
        this.discount = discount;
    }

    @Override
    public Integer getId() {
        return iCourse.getId();
    }

    @Override
    public String getName() {
        return iCourse.getName();
    }


    @Override
    public double getPrice() {
        return iCourse.getPrice() * this.discount;
    }

    public double getOringinalPrice(){
        return iCourse.getPrice();
    }
}
