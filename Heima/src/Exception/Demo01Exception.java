package Exception;
/*
    java.lang.Throwable: 类是java语言中所有错误或异常的超类。
     Exception： 编译器异常， 进行编译时java程序出现的问题
        RuntimeException: 运行期异常，java程序运行过程中出现的问题
        异常相当于程序得了一个小感冒，把异常处理掉，程序可以继续执行
     Error：错误
         错误相当于程序得了非典艾滋，必须修改源代码，程序才能运行
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01Exception {
    public static void main(String[] args) /*throws ParseException */{
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");       //用来格式化日期
//        try {
//            Date date = sdf.parse("1999-09-09");
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }

       //RuntimeException : 运行期异常
        int[] arr = {1,2,3};

        try{
            //可能会出现异常的代码
            System.out.println(arr[3]);
        } catch(Exception e){
            //异常的处理逻辑
            System.out.println(e);
        }



    }
}
