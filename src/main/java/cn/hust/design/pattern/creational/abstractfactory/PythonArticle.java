package cn.hust.design.pattern.creational.abstractfactory;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-05 20:40
 **/
public class PythonArticle implements Article {
    @Override
    public void getArticle() {
        System.out.println("python article");
    }
}
