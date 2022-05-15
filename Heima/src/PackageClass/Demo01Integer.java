package PackageClass;

/*
 装箱： 基本数据类型的数据转换成包装类
 构造方法：
  Integer(int value)   构造一个新分配的Integer对象，他表示指定的int值。
  Integer(String s)  构造一个新分配的Integer对象，它表示String参数所指示的int值。
  传递的字符串必须是基本类型的字符串，否则会抛出异常。

  静态方法；
  static Integer valueOf(int i)   返回一个表示指定int值的Integer实例。
  static Integer valueOf(String s)   返回保存指定的String值的Integer对象。

 拆箱： 在包装类中取出基本类型的数据。
  成员方法：
   int intValue()


 */

public class Demo01Integer {
    public static void main(String[] args) {

//        构造方法
//     有横线说明方法过时了
        Integer in1 = new Integer(1);
        System.out.println(in1);
//        重写了toString()方法

//        静态方法
        Integer in3 = Integer.valueOf(1);
        System.out.println(in3);

        Integer in4 = Integer.valueOf("1");
        System.out.println(in4);

//        NumberFormatException 数字格式化异常

        int i = in1.intValue();
        System.out.println(i);
    }

}
