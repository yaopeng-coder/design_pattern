package cn.hust.design.pattern.creational.abstractfactory;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-04 20:09
 **/
public class Test {


    public static void main(String[] args){

        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.getVideoName();;
        article.getArticle();


    }

}
