package cn.hust.design.pattern.behavioral.command;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-19 12:29
 **/
public class CloseCourseVideoCommand implements Command{

    private CourseVideo courseVideo;

    public CloseCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        this.courseVideo.closeCourseVideo();
    }
}
