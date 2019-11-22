package cn.hust.design.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-19 12:30
 **/
public class Staff {

    //调用者

    public List<Command> commandList = new ArrayList<Command>();


    public void saveCommand(Command command){
        commandList.add(command);
    }

    public void executeCommand(){
        for(Command command : commandList){
            command.execute();
        }

        commandList.clear();
    }
}
