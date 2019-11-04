package cn.hust.design.pattern.creational.factoryMethod;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-04 20:09
 **/
public class Test {


    public static void main(String[] args){

     /*   Video video = new JavaVideo();
        video.getVideoName();
        video = new PythonVideo();
        video.getVideoName();*/

    /* VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("java");
        video.getVideoName();
        video = videoFactory.getVideo("");
        video.getVideoName();*/

    VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        video.getVideoName();
        video = videoFactory.getVideo(PythonVideo.class);
        video.getVideoName();


    }

}
