package Interface;

/*
接口当中也可以定义成员变量，但是必须使用public static final进行修饰
这其实就是接口的常量
格式：
public static final 数据类型 常量名称 = 数据值;
一旦使用final修饰说明不可变

注意事项：
1. public static final可以省略
2. 接口中的常量必须赋值
3. 接口中常量的名称，使用完全大写，用下划线进行分隔
 */


public interface MyInterfaceConst {

//    这其实就是一个常量。
    public static final int NUM = 10;
}

