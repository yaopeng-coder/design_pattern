package cn.hust.design.principle.dependenceinversion;

/**
 * 依赖倒置原则
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-03 16:25
 **/
public class test {

    public static void main(String[] args){


         /*  v1
          Baby baby = new Baby();
            baby.studyJavaCourse();
            baby.studyPeCourse();
            baby.studyPythonCourse();*/

/*    v2
         Baby baby = new Baby();
         baby.studyCourse(new JavaCourse());
         baby.studyCourse(new FECourse());*/

       /*  v3
        Baby baby = new Baby(new JavaCourse());
        baby.studyCourse();*/


       Baby baby = new Baby();
       baby.setIcourse(new JavaCourse());
       baby.studyCourse();
       baby.setIcourse(new FECourse());
       baby.studyCourse();





    }
}
