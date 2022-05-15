package Exception;

/*
异常产生的机制：
1. JVM检测出程序会出现异常后会做两件事情
    1.1 JVM会根据异常的产生原因创建一个异常对象，这个异常对象包含了异常产生的（内容，原因，位置）
            new ArrayIndexOutOfBoundsException("3");
    1.2 在getElement方法中，没有异常的处理逻辑（try...catch),那么JVM就会把异常对象抛出给方法的调用者
            main方法来处理这个异常

2. main方法接受了这个异常对象，main方法也没有异常的处理逻辑，继续把对象抛出给main方法的调用者JVM处理

3. JVM接受了这个异常对象，做了两件事情
    3.1 把异常对象以红色的字体打印在控制台
    3.2 JVM会终止当前正在执行的Java程序 》  中断程序

 */


public class Demo02Exception {
    public static void main(String[] args) {
        //创建int类型的数组，并赋值
        int[] arr = {1,2,3};
        int e = getElement(arr, 3);
        System.out.println(e);
    }

    /*
    定义一个方法，获取指定索引处的元素
     */
    public static int getElement(int[] arr, int index){
        int ele = arr[index];
        return ele;
    }

}

