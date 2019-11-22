package cn.hust.design.pattern.behavioral.command;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-19 12:35
 **/
public class Test {

    public static void main(String[] args){

        CourseVideo courseVideo = new CourseVideo("设计模式");
        Command command1 = new OpenCourseVideoCommand(courseVideo);
        Command command2 = new CloseCourseVideoCommand(courseVideo);

        Staff staff = new Staff();
        staff.saveCommand(command1);
        staff.saveCommand(command2);
        staff.executeCommand();


    }
}
