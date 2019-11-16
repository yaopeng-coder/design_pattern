package cn.hust.design.pattern.behavioral.templated;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-16 18:13
 **/
public abstract class Acourse {

    protected final void makeCourse(){
        makePPT();
        if(needMakeVideo()){
            makeVideo();
        }
       packageCourse();


    }

    final void makePPT(){
        System.out.println("制作课程的PPT");
    }


    final void makeVideo(){
        System.out.println("制作课程的video");
    }

    //钩子方法
    boolean needMakeVideo(){
        return false;
    }


    abstract void packageCourse();


}
