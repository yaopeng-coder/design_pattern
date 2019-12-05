package cn.hust.design.pattern.creational.singleton.enumtest;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-12-04 15:14
 **/


    //懒汉模式 枚举实现
    public class LazyEnumTest {
        //不实例化
        public List<String> list = null;// list属性

        private LazyEnumTest(){//构造函数
            list = new ArrayList<String>();
        }
        //使用枚举作为内部类
        private enum EnumSingleton {
            INSTANCE;//不实例化
            private LazyEnumTest instance = null;

            private EnumSingleton(){//构造函数
                instance = new LazyEnumTest();
            }
            public LazyEnumTest getSingleton(){
                return instance;//返回已存在的对象
            }
        }

        public static LazyEnumTest getInstance(){
            return EnumSingleton.INSTANCE.getSingleton();//返回已存在的对象
        }
    }

