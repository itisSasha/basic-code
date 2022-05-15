package Interface;

/*
1. 接口的默认方法，可以通过接口实现类对象，直接调用
2. 接口的默认方法，也可以被接口实现类进行覆盖重写
 */


public class Demo2Interface {
    public static void main(String[] args) {
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodAbs();

//        调用默认方法，如果实现类里面没有，会向上找接口
        a.methodDefault();


        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAbs();
        b.methodDefault();
    }
}
