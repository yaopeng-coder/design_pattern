package cn.hust.design.pattern.behavioral.interpreter;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-19 09:11
 **/
public class NumberInterpreter implements Interpreter {
    private int number;
    public NumberInterpreter(int number){
        this.number=number;
    }
    public NumberInterpreter(String number){
        this.number=Integer.parseInt(number);
    }
    @Override
    public int interpret(){
        return this.number;
    }
}
