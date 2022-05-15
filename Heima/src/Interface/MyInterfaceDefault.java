package Interface;

/*
从java8开始，接口里允许定义默认方法
格式：
public default 返回值类型 方法名（参数列表）{
    方法体
}

备注： 接口中的默认方法可以解决接口升级的问题
 */

public interface MyInterfaceDefault {
    public abstract  void methodAbs();

//    public abstract  void methodAbs2();
//  将新添加的方法改成默认方法就不会报错
    public default  void methodDefault(){
        System.out.println("这是新添加的默认方法");
    }


}
