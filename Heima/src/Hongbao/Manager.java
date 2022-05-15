package Hongbao;

import java.util.ArrayList;

public class Manager extends User{

    public Manager(){
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count){
//        需要一个集合，存储若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();

//        群主当前余额
        int leftMoney = super.getMoney();
        if(totalMoney > leftMoney){
            System.out.println("余额不足");
            return redList;       //返回空集合
        }

//        群主扣钱
        super.setMoney(leftMoney-totalMoney);

//        发红包需要平均拆分为count份
        int avg = totalMoney / count;
        int mod = totalMoney % count;       //剩下的零头

//        把红包放到集合当中
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }

        int last = avg + mod;
        redList.add(last);

        return redList;
    }
}

