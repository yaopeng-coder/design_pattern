package cn.hust.design.pattern.creational.singleton.enumtest;

import java.util.ArrayList;
import java.util.List;

//饿汉模式 枚举实现
public enum Singleton {
    INSTANCE;//不实例化
    public List<String> list = null;// list属性

  private Singleton() {//构造函数
    list = new ArrayList<String>();
  }
    public static Singleton getInstance(){
        return INSTANCE;//返回已存在的对象
    }
}