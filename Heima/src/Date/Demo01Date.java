package Date;
/*
 java.util.Date:  表示日期和时间的类
 类 Date表示特定的瞬间，精确到毫秒。
 毫秒： 千分之一秒  1000毫秒=1秒
 2088-08-08 09:55:33:333 瞬间

 毫秒值的作用：
 可以对时间和日期进行计算
 可以把日期转换为毫秒值进行计算，计算完毕，再把毫秒值转换为日期

 把日期转换为毫秒：
 当前的日期： 2088-08-08
 时间原点： 1970年1月1日  00:00:00 （英国格林威治）
 就是计算当前日期到时间远点之间一共经历了多少毫秒(1652586204024L)

 把毫秒转换为日期
 1天 = 24 X 60 X 60 = 86400秒 = 864000 X 1000 = 864000000毫秒

 注意：
 中国属于东八区，会把时间增加8个小时
 1970年1月1日 08:00:00
 */

public class Demo01Date {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
    }
}
