package Interface;

/*    接口就是多个类的公共规范，接口是一种引用数据类型。
    最重要的是其中的抽象方法
    接口格式
   public interface 接口名称{
    接口内容
   }

    java7:
    1. 常量
    2.抽象方法

    java8:
    3.默认方法
    4.静态方法

如果实现类没有覆盖重写接口中所有的抽象方法，那么这个实现类自己就必须是抽象类

 */
public class Demo01 {
    public static void main(String[] args) {
//       接口不能直接new使用，创建实现类的对象使用
        MyInterfaceAbstractImpl inter = new MyInterfaceAbstractImpl();
        inter.methodsAbs();
    }
}
