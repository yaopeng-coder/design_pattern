package cn.hust.design.pattern.behavioral.interpreter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-19 09:11
 **/
public class Test {
    public static void main(String[] args) {
        String geelyInputStr="6 100 11 + *";
        ThexxExpressionParser expressionParser=new ThexxExpressionParser();
        int result=expressionParser.parse(geelyInputStr);
        System.out.println("解释器计算结果: "+result);

        Pattern pattern = Pattern.compile("....");
        Matcher matcher = pattern.matcher("s");
    }
}
