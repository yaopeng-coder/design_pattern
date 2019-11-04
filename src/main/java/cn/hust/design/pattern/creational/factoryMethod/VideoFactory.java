package cn.hust.design.pattern.creational.factoryMethod;



/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-04 20:10
 **/
public class VideoFactory {
/*
    public Video getVideo(String name){
        if(name.equals("java")){
            return new JavaVideo();
        }else {
            return new PythonVideo();
        }
    }*/

        public Video getVideo(Class c){

            try {
                return (Video) Class.forName(c.getName()).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            return null;
        }

}
