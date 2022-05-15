package Static;

public class Demo03StaticStudent {

    public static void main(String[] args) {
//    首先设置教室
        Student.room = "101教室";

        Student one = new Student("张三", 20);
        System.out.println(one.getAge());
        System.out.println(one.getName());
        System.out.println(Student.room);

        Student two = new Student("李四", 18);
        System.out.println(two.getName());
        System.out.println(two.getAge());
        System.out.println(Student.room);

    }





}
