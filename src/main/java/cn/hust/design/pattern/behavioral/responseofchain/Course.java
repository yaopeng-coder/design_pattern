package cn.hust.design.pattern.behavioral.responseofchain;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-19 17:20
 **/

public class Course {

    private String courseName;
    private String video;
    private String article;

    public Course(String courseName, String video, String article) {
        this.courseName = courseName;
        this.video = video;
        this.article = article;
    }

    public String getVideo() {
        return video;
    }

    public String getArticle() {
        return article;
    }
}
