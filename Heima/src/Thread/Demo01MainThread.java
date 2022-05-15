package Thread;
/*
    主线程： 执行main方法的线程

    单线程程序：java程序中只有一个线程
    执行方法从main开始，从上到下执行

    JVM执行main方法，

 */

public class Demo01MainThread {
    public static void main(String[] args) {
        Person p1 = new Person("小李");
        p1.run();

        Person p2 = new Person("小王");
        p2.run();
    }
}
