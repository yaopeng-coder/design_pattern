package cn.hust.design.pattern.constructural.flyweight;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-13 20:26
 **/
public class Manager implements Employee {

    private String content;
    private String department;

    public Manager(String department) {
        this.department = department;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void report() {

        System.out.println("该部门"+department+"在做报告"+content);

    }
}
