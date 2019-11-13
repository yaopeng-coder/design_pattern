package cn.hust.design.pattern.constructural.flyweight;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-13 20:32
 **/
public class Test {

    //享元模式 = 工厂模式 + 池
    public static void main(String[] args){

        EmployeeFlyWeightFactory pool = new EmployeeFlyWeightFactory();
        String[] departments = {"开发","测试","运维"};
        for(int i = 0; i<10;i++){
          Manager manager  = (Manager) pool.getEmpployee(departments[(int)(Math.random() * departments.length)]);
          manager.setContent("我今天讲设计模式");
          manager.report();
        }
        System.out.println(EmployeeFlyWeightFactory.map);


    }
}
