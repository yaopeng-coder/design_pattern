package cn.hust.design.principle.dependenceinversion;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-03 16:24
 **/
public class Baby {

    private Icourse icourse;

    public void setIcourse(Icourse icourse) {
        this.icourse = icourse;
    }

    public void studyCourse(){
        icourse.studyCourse();
    }
}
