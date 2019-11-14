package cn.hust.design.pattern.constructural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-14 19:35
 **/
public class ConcreteCompany extends Company {

    List<Company> companyList = new ArrayList<>();

    private Integer level;

    public ConcreteCompany(String name,Integer level) {
        super(name);
        this.level = level;
    }

    @Override
    public void add(Company company) {
       companyList.add(company);
    }

    @Override
    public void remove(Company company) {
        companyList.remove(company);
    }

    @Override
    public void print() {

        System.out.println(this.getName());
        for(Company company :companyList){
            if(level != null){
                for(int i = 0;i < level;i++){
                    System.out.print(" ");
                }
            }
            company.print();
        }



    }
}
