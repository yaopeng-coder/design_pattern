package cn.hust.design.principle.demeter;

/**
 * 迪米特原则
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-03 18:43
 **/
public class Test {
    public static void main(String[] args){
            Boss boss = new Boss();
            TeamLeader teamLeader = new TeamLeader();
            boss.checkCourseNumber(teamLeader);
    }
}
