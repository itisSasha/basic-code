package Interface;

public interface MyInterfaceA {

//    错误，接口里不能有静态代码块
//    static {
//
//    }

//    错误，接口里不能有构造方法
//    public MyInterface(){
//
//    }

    public abstract void methodA();

    public abstract void methodAbs();

    public default void methodDefault(){
        System.out.println("默认方法AAA");
    }

}
