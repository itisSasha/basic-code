package PackageClass;

import java.util.ArrayList;

/*

自动装箱与自动拆箱：  基本类型的数据和包装类直接可以自动转换

 */
public class Demo02Integer {
    public static void main(String[] args) {
//        自动装箱： 直接把int类型的整数赋值给包装类
//        Integer in = 1; 就相当于 Integer in = new Integer(1);

        Integer in = 1;

//        自动拆箱
//        in是包装类，无法直接参与运算。可以自动转换为基本类型，进行运算。
//        in + 2 就相当于 in.intValue() + 2 = 3

        in = in + 2;

//        ArrayList集合无法直接存储整数，可以存储一个包装类
        ArrayList<Integer> list = new ArrayList<>();
//        自动装箱，list.add(new Integer(1));
        list.add(1);

//        自动拆箱 list.get(0).intValue();
        int a = list.get(0);
    }
}
