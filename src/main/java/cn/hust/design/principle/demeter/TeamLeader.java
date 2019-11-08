package cn.hust.design.principle.demeter;


import java.util.ArrayList;
import java.util.List;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-03 18:39
 **/
public class TeamLeader {

    public void checkCourseNumbers(){
        List<Course> courseList = new ArrayList<Course>();
        for(int i = 0; i< 10;i++){
            courseList.add(new Course());
        }

        System.out.println("课程数目为"+courseList.size());
    }
}
