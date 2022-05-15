package Random;

/*
根据int变量n的值，来获取随机数字。范围是[1, n] ,可以取到1，也可以取到n。

思路：
1. 定义一个int变量n,随意赋值。
2. 要使用Random，三个步骤，导包，创建，使用
3. 整体加一即可
4. 打印随机数字

 */


import java.util.Random;

public class Demo03Random {
    public static void main(String[] args) {
        int n = 5;
        Random r = new Random();

        for(int i =0; i<100; i++){
            //本来范围是[0,n),整体加1之后变成了[1,n+1),也就是[1,n]
            int result = r.nextInt(5) + 1;
            System.out.println(result);
        }


    }
}
