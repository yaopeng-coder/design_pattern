package cn.hust.design.pattern.behavioral.responseofchain;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-19 17:25
 **/
public class Test {

    public static void main(String[] args){


        Course course = new Course("设计模式","设计模式视频","设计模式文章");
        Handler articleHandle = new ArticleHandler("文章审核");
        Handler videoHandle = new VideoHandler("视频审核");
        articleHandle.setHandler(videoHandle);
        articleHandle.deploy(course);
    }
}
