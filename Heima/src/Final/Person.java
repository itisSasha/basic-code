package Final;

/*
1. 由于成员变量有默认值，所以用了final之后必须手动赋值
2. 对于final的成员变量，要么使用直接赋值，要么通过构造方法赋值。二者选其一。
3. 必须保证类当中的所有重载的构造方法，都最终会对final的成员变量进行赋值。

 */

public class Person {
    private final String name /* = "张三"*/;

    public Person(){
        name = "李四";
    }

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
}
