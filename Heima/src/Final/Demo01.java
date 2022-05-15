package Final;

/*
final关键字代表最终的，不可变的。

常见的四种用法：
1. 用来修饰一个类
2. 用来修饰一个方法
3. 用来修饰一个局部变量
4. 用来修饰一个成员变量
 */



public class Demo01 {
    public static void main(String[] args) {
//        一次赋值，终身不变
        final int num2 = 200;


//        对于基本类型来说，不可变的是变量当中的数据不可变
//        对于引用类型来说，不可变的是变量当中的地址值不可变
        Student stu1 = new Student("张三");
        System.out.println(stu1);
        System.out.println(stu1.getName()); //张三

        stu1 = new Student("里斯");
        System.out.println(stu1);
        System.out.println(stu1);      //里斯

        final Student stu2 = new Student("高圆圆");

//        final的引用型变量其中的地址值不改变
//        stu2 = new Student("赵又廷");

        stu2.setName("高圆圆圆圆");
        System.out.println(stu2.getName());

    }
}

