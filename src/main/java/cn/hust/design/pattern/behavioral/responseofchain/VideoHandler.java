package cn.hust.design.pattern.behavioral.responseofchain;

import org.apache.commons.lang3.StringUtils;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-19 17:21
 **/
public class VideoHandler extends Handler {

    public VideoHandler(String handleName) {
        super(handleName);
    }

    @Override
    public void deploy(Course course) {
        if(StringUtils.isNotBlank(course.getVideo())){
            System.out.println("视频审核通过");
            if(this.handler != null){
                this.handler.deploy(course);
            }
        }else{
            System.out.println("视频审核不通过");
        }
    }
}
