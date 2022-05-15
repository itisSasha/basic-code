package Hongbao;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list){
//        随便获取一个索引
        int index = new Random().nextInt(list.size());
//        从集合中删除红包，给我自己
        int delta = list.remove(index);
//        成员自己的钱数
        int money = super.getMoney();
//        加法
        super.setMoney(money + delta);

    }
}
