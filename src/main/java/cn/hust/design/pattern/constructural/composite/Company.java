package cn.hust.design.pattern.constructural.composite;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-14 19:33
 **/
public abstract class Company {


    private String name ;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void add(Company company){
        throw new RuntimeException();
    }

    public void remove(Company company){
        throw new RuntimeException();
    }

    public void display(Company company){
        throw new RuntimeException();
    }

    public void print(){
        throw new RuntimeException();
    }

}
