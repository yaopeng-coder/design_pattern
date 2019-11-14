package cn.hust.design.pattern.constructural.composite;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-14 19:41
 **/
public class Test {

    public static void main(String[] args){

        Company company = new ConcreteCompany("软件总公司",1);
        Company company1 = new ConcreteCompany("北京分公司",3);
        Company company2 = new ConcreteCompany("武汉分公司",3);

        company.add(company1);
        company.add(company2);

        Company hrdepartment = new HRdepartment("北京hr部门");
        Company javadepartment = new Javadepartment("北京Java部门");
        company1.add(hrdepartment);
        company1.add(javadepartment);

        Company hrdepartment1 = new HRdepartment("武汉hr部门");
        Company javadepartment1 = new Javadepartment("武汉Java部门");
        company2.add(hrdepartment1);
        company2.add(javadepartment1);

        company.print();


    }
}
