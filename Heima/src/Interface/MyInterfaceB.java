package Interface;

public interface MyInterfaceB {

//    错误，接口里不能有静态代码块
//    static {
//
//    }

//    错误，接口里不能有构造方法
//    public MyInterface(){
//
//    }
    
    public abstract void methodB();
    public abstract void methodAbs();

    public default void methodDefault(){
        System.out.println("默认方法BBB");
    }
}
