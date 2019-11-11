package cn.hust.design.pattern.constructural.adapter;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-11 19:58
 **/
public class AC220 {

  public Integer outputDC5V(){
      Integer output = 220;
      System.out.println("我原来是220v");
      return output;
  }
}
