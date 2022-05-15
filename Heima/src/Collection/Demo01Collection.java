package Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
        java.util.Collection接口
        所有单列集合的最顶层的接口，定义了所有单列集合共性的方法
        任意的单列集合都可以使用Collection接口中的方法

        public boolean add(E):     给定的对象添加到当前集合中
        public boolean remove(e): 把给定的对象在当前的集合中删除
        public boolean contains(e):  判断当前集合中是否包含给定的对象
        public boolean isEmpty():  判断当前集合是否为空
        public int size():  返回集合中元素的个数
        public Object[] toArray():  集合中的元素存储到数组里
        public void clear() : 清空集合中的所有元素，集合还在

 */
public class Demo01Collection {
//
  public static void main(String[] args) {
//      使用多态创建集合对象
     Collection<String> coll = new ArrayList<>();
      System.out.println(coll);              // 重写了toString()方法 []


//  public boolean add(e) 的返回值一般是true,可以不用接收

    boolean b1 = coll.add("sala");
      System.out.println(coll);

//      public boolean remove(e): 把给定的对象在当前的集合中删除
//      返回值是一个boolean值， 集合中存在元素，删除元素，返回true.
//        集合中不存在元素，返回false.

      boolean b2 = coll.remove("sala");

      boolean b3 = coll.contains("sali");

      boolean b6 = coll.isEmpty();     //集合为空返回true

      int size = coll.size();

      Object[] arr = coll.toArray();
      for(int i =0; i < arr.length; i++){
          System.out.println(arr[i]);
      }

      coll.clear();
      System.out.println(coll);


  }

}
