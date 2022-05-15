package Exception;

/*
    throw关键字：
        可以使用throw关键字在指定的方法中抛出指定的异常
    使用格式：
        throw new xxxException("异常产生的原因");

    注意：
        1. throw关键字必须写在方法的内部
        2. throw关键字后面new的对象必须是Exception或者Exception的子类对象
        3. throw关键字后抛出指定的异常，我们就必须处理这个异常。
            RuntimeException或者是RuntimeException的子对象，我们可以不处理，默认交给JVM处理（打印异常，中断程序）
            如果是编译异常，我们就必须处理这个异常，要么throws, 要么try...catch

 */

public class Demo03Throw {
    public static void main(String[] args) {
       // int[] arr = null;
        int[] arr = new int[3];
        int e = getElement(arr, 3);
        System.out.println(e);


/*
    工作中我们首先必须对方法传递过来的参数进行合法性校验，
    如果参数不合法，我们就必须使用抛出异常的方式，告知方法的调用者，传递的参数有问题
    注意：NullPointerException是一个运行期异常，我们不用处理，默认交给JVM处理
    ArrayIndexOutOfBoundsException是一个运行期异常，我们不用处理，默认交给JVM处理
 */

    }

    public static int getElement(int[]arr,int index){
        /*
        如果数组的值是null,那么就抛出空指针异常
         */
        if(arr == null){
            throw new NullPointerException("传递的数组为null");
        }

        /*
            对传递来的参数进行合法性校验，
            如果index的范围不再数组的索引范围内，抛出数组索引越界异常
         */
        if(index < 0 || index > arr.length-1){
            throw new ArrayIndexOutOfBoundsException("数组索引越界异常");
        }

        int ele = arr[index];
        return ele;
    }

}


