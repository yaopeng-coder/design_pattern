package cn.hust.design.pattern.behavioral.responseofchain;

import org.apache.commons.lang3.StringUtils;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-19 17:21
 **/
public class ArticleHandler extends Handler {

    public ArticleHandler(String handleName) {
        super(handleName);
    }

    @Override
    public void deploy(Course course) {
        if(StringUtils.isNotBlank(course.getArticle())){
            System.out.println("文章审核通过");
            if(this.handler != null){
                this.handler.deploy(course);
            }
        }else{
            System.out.println("文章审核不通过");
        }
    }
}
