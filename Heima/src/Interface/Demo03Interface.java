package Interface;

/*
注意：  不能通过接口实现类的对象来调用接口中的静态方法
正确写法：  通过接口名称，直接调用其中的静态方法. 因为静态方法和对象没有联系
格式：
接口名称.静态方法（参数）；

 */
public class Demo03Interface {
    public static void main(String[] args) {
//        创建了实现类对象
        MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();

//        错误写法
//        impl.methodStatic();

//        直接通过接口来调用静态方法
        MyInterfaceStatic.methodStatic();
    }
}
