package cn.hust.design.principle.dependenceinversion;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-03 16:29
 **/
public class JavaCourse implements Icourse {
    @Override
    public void studyCourse() {
        System.out.println("学习java");
    }
}
