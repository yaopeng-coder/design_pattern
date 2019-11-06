package cn.hust.design.pattern.creational.builder.v2;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-05 21:52
 **/
public class Course {

    private String courseName;
    private String coursePrice;
    private String courseArticle;
    private String courseQA;

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePrice='" + coursePrice + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCoursePrice(String coursePrice) {
        this.coursePrice = coursePrice;
    }

    public void setCourseArticle(String courseArticle) {
        this.courseArticle = courseArticle;
    }

    public void setCourseQA(String courseQA) {
        this.courseQA = courseQA;
    }



    public Course(CourseBuilder courseBuilder) {

        this.setCourseName(courseBuilder.courseName);
       this.setCourseArticle(courseBuilder.courseArticle);
       this.setCoursePrice(courseBuilder.coursePrice);
       this.setCourseQA(courseBuilder.courseQA);
    }

    public static class CourseBuilder{


        private  String courseName;
        private String coursePrice;
        private String courseQA;
        private String courseArticle;


        public  CourseBuilder setCourseName(String courseName) {
            this.courseName = courseName;
            return this;
        }


        public CourseBuilder setCoursePrice(String coursePrice) {

            this.coursePrice = coursePrice;
            return this;
        }


        public CourseBuilder setCourseArticle(String courseArticle) {
          this.courseArticle = courseArticle;
          return this;
        }


        public CourseBuilder setCourseQA(String courseQA) {

          this.courseQA = courseQA;
          return this;
        }

        public Course build(){
            return new Course(this);
        }



    }
}
