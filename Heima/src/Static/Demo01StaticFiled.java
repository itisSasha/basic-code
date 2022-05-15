package Static;

/*
如果一个成员变量使用了static关键字，那么这个变量不再属于对象自己，而是属于自己所在的类。多个对象共享一份数据。

 */

public class Demo01StaticFiled {
    public static void main(String[] args) {
    Student one = new Student("张三", 19);
    one.room = "101教室";
        System.out.println("name:" + one.getName() + "age:" + one.getAge() + one.room + "ID:" + one.getId());
    Student two = new Student("李四",16);
        System.out.println("name:" + two.getName() + "age:" + two.getAge() + two.room + "ID:" + two.getId());
    }
}
