package cn.hust.design.pattern.creational.singleton;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-06 21:09
 **/
public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
//             new Thread(new MyRunnable()).start();
//             new Thread((new MyRunnable())).start();
//             System.out.println("hello");

       /* //序列化破坏单例模式演示
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        //输出流写对象到文件中
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Singleton.file"));
        objectOutputStream.writeObject(hungrySingleton);

        //输入流读文件
        File file = new File("Singleton.file");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
       HungrySingleton hungrySingletonNew = (HungrySingleton) objectInputStream.readObject();
       System.out.println(hungrySingleton);
       System.out.println(hungrySingletonNew);*/

       //反射破坏单例模式，但在饿汉式和静态内部类懒汉式可以加判断解决

      /*  Constructor<HungrySingleton> constructor = HungrySingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        HungrySingleton hungrySingleton = constructor.newInstance();

        HungrySingleton hungrySingletonNew = HungrySingleton.getInstance();

        System.out.println(hungrySingleton);
        System.out.println(hungrySingletonNew);
        System.out.println(hungrySingleton == hungrySingletonNew);*/


        //反射破坏单例模式，懒汉式syn无用
        Class<?> aClass = Class.forName("cn.hust.design.pattern.creational.singleton.LazySingleton");
        Constructor<?> constructor = aClass.getDeclaredConstructor();
        Constructor<LazySingleton> constructor1 = LazySingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);

        Field flag = LazySingleton.class.getDeclaredField("flag");
        flag.setAccessible(true);
        LazySingleton lazySingleton = (LazySingleton)constructor.newInstance();
        flag.set(lazySingleton,true);
        LazySingleton lazySingleton1 = LazySingleton.getInstance();

        System.out.println(lazySingleton);
        System.out.println(lazySingleton1);
        System.out.println(lazySingleton == lazySingleton1);

    }
}
