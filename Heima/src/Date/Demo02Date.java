package Date;

import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
    }

    /*
    long getTime()  把日期转换为毫秒值(相当于System.currentTimeMills()方法）

     */

    public static void demo03(){
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);

    }



    /*
    Date类的带参数的构造方法
    Date(long date): 传递毫秒值，把毫秒值转换为日期

     */

    public static void demo02(){
        Date date = new Date(0L);
        System.out.println(date);
    }



    /*
     Date类的空参数构造方法
     Date()获取当前的日期和时间

     */


    public static void demo01(){
        Date date = new Date();
        System.out.println(date);
    }
}
