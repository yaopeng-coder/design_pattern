package cn.hust.design.pattern.creational.singleton;


public enum EnumSingleton {

    SINGLETON{
        protected void test(){
            System.out.println("hello");
        }
    };

    protected abstract void test();

    private  Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    public static  EnumSingleton getIntance(){
        return SINGLETON;
    }
}
