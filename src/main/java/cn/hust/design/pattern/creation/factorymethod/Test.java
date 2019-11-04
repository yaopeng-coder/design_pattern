package cn.hust.design.pattern.creation.factorymethod;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-04 20:09
 **/
public class Test {


    public static void main(String[] args){

        VideoFactory videoFactory = new JavaVideoFactory();
        VideoFactory videoFactory1 = new PythonVideoFactory();
        Video video = videoFactory.getVideo();
        Video video1 = videoFactory1.getVideo();
        video.getVideoName();
        video1.getVideoName();



    }

}
