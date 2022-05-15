package Final;

/*
final关键字来修饰一个类
public final class 类名称{

    // ....
}

含义： 当前这个类不能有任何的子类。太监类。
注意：  一个类如果是final的，那么其中所有成员方法都无法进行覆盖重写。（因为没儿子）
 */

public final class Myclass /*extends Object*/ {

    public void method(){
        System.out.println("方法执行");
    }
}



