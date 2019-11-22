package cn.hust.design.pattern.behavioral.command;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-19 12:21
 **/
public class CourseVideo {

    //接收者，具体动作的执行者

    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public void openCourseVideo(){
        System.out.println(this.name+"打开课程录像");
    }

    public void closeCourseVideo(){
        System.out.println(this.name+"关闭课程录像");
    }
}
