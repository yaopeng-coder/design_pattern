package cn.hust.design.pattern.constructural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-13 20:28
 **/
public class EmployeeFlyWeightFactory {

    public static final Map<String ,Employee> map = new HashMap<>();

    public Employee getEmpployee(String department){

        if(!map.containsKey(department)){
            Employee employee = new Manager(department);
            map.put(department,employee);
        }

        return map.get(department);
    }
}
