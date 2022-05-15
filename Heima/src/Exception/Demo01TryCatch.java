package Exception;

/*
    try...catch : 异常处理的第二种方式，自己处理异常
    格式：
        try{
            可能产生异常的代码
        } catch( 定义一个异常的变量，用来接收try中抛出的异常对象){
            异常的处理逻辑，异常异常对象之后，怎么处理异常对象
            一般在工作里，会把异常的信息记录到一个日志中
        }
        ...
        catch(异常类名，变量名){

        }

     注意：
        1. try中可能会抛出多个异常，那么可以使用多个catch来处理这些异常对象
        2. 如果try产生了异常，就会执行catch中的异常处理逻辑，继续执行try...catch之后的代码
           如果try没有产生异常，就不会执行catch中的异常的处理逻辑，继续执行try...catch之后的代码

 */

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo01TryCatch {
    public static void main(String[] args) {
        try {
            readFile("d:\\a.tx");
        } catch (IOException e){      //try中抛出什么异常对象，catch就定义什么异常变量，用来接收这个异常对象
            System.out.println("文件后缀名不对");
        }
        System.out.println("后续代码");
    }


    public static void readFile(String Filename) throws IOException {

        if(!Filename.endsWith(".txt")){
            throw new IOException("文件后缀名不对");
        }

        System.out.println("路径没有问题，读取文件");
    }

}
