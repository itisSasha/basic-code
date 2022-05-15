package Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo05Throws {

    /*
     FileNotFoundException extends IOException
     如果抛出的多个异常对象有子父类关系，那么直接声明父类即可
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        readFile("c:\\\\a.txt");
    }

    /*
    定义一个方法，对传递的文件路径进行合法判断，
    如果路径不是"c:\\a.txt" , 那么我们就抛出文件异常
    注意：
        FileNotFoundException是编译异常，抛出了编译异常，就必须处理这个异常
        可以使用throws继续声明抛出FileNotFoundException这个异常对象，让方法的调用者处理
     */
    public static void readFile(String Filename) throws FileNotFoundException, IOException{
        if(!Filename.equals("c:\\\\a.txt")){
            throw new FileNotFoundException("传递的文件路径有误");
        }

        if(!Filename.endsWith(".txt")){
            throw  new IOException("文件后缀名不对");
        }


        System.out.println("路径没有问题，读取文件");
    }


}
