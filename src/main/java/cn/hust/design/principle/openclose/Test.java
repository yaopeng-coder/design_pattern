package cn.hust.design.principle.openclose;

/**
 * 开闭原则，以增加一个打折价格演示
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-03 15:30
 **/
public class Test {

    public static void main(String[] args){
            ICourse iCourse = new JavaDiscountCourse(new JavaCourse(1,"设计模式",100d),0.8d);
            JavaDiscountCourse discountCourse = (JavaDiscountCourse)iCourse;
            System.out.println("课程id："+discountCourse.getId()+",课程名字："+discountCourse.getName()+",原来价格："
                    +discountCourse.getOringinalPrice()+",打折价格："+discountCourse.getPrice());

    }
}
