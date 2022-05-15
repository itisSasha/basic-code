package Interface;

/*

我们需要定义一个共有方法，来解决两个默认方法直接重复代码的问题。
但是这个方法不应该让类实现，应该是私有化的。

从java9开始，接口当中允许定义私有方法。

1.普通私有方法，解决默认方法直接重复代码的问题
格式：
private 返回值类型 方法名称（参数列表）{
    方法体
}

2.静态私有方法，解决静态方法直接重复代码的问题
格式：
private static 返回值类型 方法名称（参数列表）{
    方法体
}

 */


public interface MyInterfacePrivateA {
    public default void methodDefault1(){
        System.out.println("默认方法1");
        methodCommon();
    }

    public default void methodDefault2(){
        System.out.println("默认方法1");
        methodCommon();
    }

    private  void methodCommon(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
