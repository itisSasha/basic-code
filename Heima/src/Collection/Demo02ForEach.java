package Collection;

import java.util.ArrayList;

/* Collection<E>extends Iterable<E>  : 所有的单列集合都可以使用增强for
public interface Iterable<T> 实现了这个接口对象成为foreach 语句的目标。

 增强for 用来遍历集合和数组
 格式：
 for(集合/数组的数据类型 变量名 ： 集合名/数组名）{
         sout(变量名)
}

*/
public class Demo02ForEach {
    public static void main(String[] args) {
        demo01();
    }

//    使用for循环遍历集合
    private static void demo02(){
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        for(String s:list){
            System.out.println(s);
        }
    }



//    使用for循环遍历数组
    private static void demo01(){
        int[] arr = {1,3,5,9};
        for(int a : arr){
            System.out.println(a);
        }
    }

}
