package cn.hust.design.pattern.behavioral.interpreter;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-19 09:11
 **/
public class SpringTest {
    public static void main(String[] args) {
        org.springframework.expression.ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("100 * 2 + 400 * 1 + 66");
        int result = (Integer) expression.getValue();
        System.out.println(result);

    }
}
