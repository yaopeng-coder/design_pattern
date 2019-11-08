package cn.hust.design.pattern.creational.singleton;

import java.io.*;
import java.lang.reflect.Field;

/**
 * 懒汉式单例模式，延迟加载
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-06 21:07
 **/
public class LazySingleton {

    private static LazySingleton lazySingleton = null;
    private static boolean flag = true;

    private LazySingleton(){
            //无效
//        if(lazySingleton != null){
//            throw  new RuntimeException("单例模式");
//        }
        if(flag == true){
            flag = false;
        }else{
            throw  new RuntimeException("单例模式禁止反射调用");
        }


    }

    public synchronized static LazySingleton getInstance() {
        if(lazySingleton == null){
            lazySingleton =  new LazySingleton();
        }
        return  lazySingleton;
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
//                String string = "hello";
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("hello.file"));
//        objectOutputStream.writeObject(string);
//
//        //输入流读文件
//        File file = new File("hello.file");
//        System.out.println(file.getPath());
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
//        String stringNew = (String) objectInputStream.readObject();
//        System.out.println(string.hashCode());
//        System.out.println(stringNew.hashCode());
//        System.out.println(string == stringNew);


        String string = "我爱你";
        Field value = String.class.getDeclaredField("value");
        System.out.println(string.hashCode()+string);
        System.out.println(value);
        value.setAccessible(true);
        value.set(string,new char[]{'d'});
        System.out.println(string.hashCode()+string);


    }
}
