package cn.hust.design.pattern.creational.builder.v2;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-05 22:01
 **/
public class Test {

    public static void main(String[] args){
        Course.CourseBuilder courseBuilder = new Course.CourseBuilder();
        Course course = courseBuilder.setCourseName("jj").setCourseArticle("ddddd").build();
        System.out.println(course);
        LoadingCache<String, Object> loadingCache = CacheBuilder.newBuilder().initialCapacity(100).build(new CacheLoader<String, Object>() {
            @Override
            public Object load(String key) throws Exception {
                return null;
            }
        });





    }
}
