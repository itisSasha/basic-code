package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
     java.util.Iterator 接口： 对集合进行遍历
     boolean hasNext()  有元素可以迭代则返回true
     e next()  返回迭代的下一个元素

  Iterator 是一个接口，我们无法直接使用，需要使用Iterator接口的实现类对象。
  Collection接口里面有一个方法，叫iterator(), 这个方法返回的就是迭代器的实现类对象
  Iterator<E> iterator()

  迭代器的使用步骤：
  1. 使用集合中的方法iterator()获取迭代器的实现对象，使用iterator接口接收（多态）
  2. 使用iterator接口中的方法hasNext()判断有没有下一个元素
  3. 使用iterator接口中的方法next取出集合中的下一个元素

 */
public class Demo02Iterator {
    public static void main(String[] args) {
//        创建一个集合对象
        Collection<String> coll = new ArrayList<>();
//        集合中添加对象
        coll.add("姚明");
        coll.add("kebi");
        coll.add("zhamuzu");
        coll.add("yaodo");

//        多态   接口           实现类对象
//        会把指针（索引）指向集合的-1索引
        Iterator<String> it = coll.iterator();

//        Iterator接口中的方法hasNext()判断有没有下一个元素
//        boolean b = it.hasNext();
//        System.out.println(b);

//        使用next()取出元素
//        String s = it.next();
//        System.out.println(s);
//
//
//        b = it.hasNext();
//        System.out.println(b);
//        s = it.next();
//        System.out.println(s);
//
//        b = it.hasNext();
//        System.out.println(b);
//        s = it.next();
//        System.out.println(s);
//
//        b = it.hasNext();
//        System.out.println(b);
//        s = it.next();
//        System.out.println(s);
//
//        b = it.hasNext();
//        System.out.println(b);
//        s = it.next();            //没有元素，在取出元素的时候会抛出NoSuchElementException没有元素异常
//        System.out.println(s);

//        可以使用循环优化， 不知道集合中有多少元素，使用while循环。 循环结束条件，hasNext()返回false.
        while(it.hasNext()){
            String e = it.next();           //1. 取出下一个元素    2.  把指针向后移动一位
            System.out.println(e);
        }


    }
}

