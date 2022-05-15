package Date;

/*
使用日期相关的API，计算出一个人出生了多少天

1. 使用Scanner中的方法next，获取出生日期
2. 使用DateFormat类中的方法parse，把字符串的出生日期，解析为date格式的出生日期
3. 把Date格式的日期转换为毫秒
4. 使用当前的信息转换为毫秒值
5. 使用当前日期的毫秒值 - 出生日期的毫秒值
6. 把毫秒的差值转换为天

 */


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo04DateFormat {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的出生日期： yyyy-MM-dd");
        String birthdayDate = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = sdf.parse(birthdayDate);
        //3. 把Date格式的日期转换为毫秒
        long time = birthday.getTime();
        //4. 使用当前的信息转换为毫秒值
        long todayTime = new Date().getTime();
        long time1 = todayTime - time;
        //6. 把毫秒的差值转换为天
        System.out.println(time1/1000/60/60/24);

    }


}

