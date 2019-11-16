package cn.hust.design.pattern.constructural.proxy.db;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-16 14:34
 **/
public class DataSourceContextHolder {

   private static ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<String>();


    public static void setContextHolder(String routeType){
        CONTEXT_HOLDER.set(routeType);
    }


    public static String getContextHolder(){
        return  (String)CONTEXT_HOLDER.get();
    }

    public static void removeContextHolder(){
        CONTEXT_HOLDER.remove();
    }


}
