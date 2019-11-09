package cn.hust.design.pattern.constructural.facade;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-09 21:31
 **/
public class QuanlitityService {

    public boolean isAvailable(PointsGift gift){
        System.out.println(gift.getName()+"通过校验，库存足够");
        return true;
    }
}
