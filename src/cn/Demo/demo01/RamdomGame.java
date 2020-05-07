package cn.Demo.demo01;

import java.util.Random;
import java.util.Scanner;

//1随机一个数字
//2 10次机会找到随机的数字

public class RamdomGame {
    public static void main(String[] args) {

        Random r = new Random();
        int randomNum=r.nextInt(100)+1;

        Scanner scanner=new Scanner(System.in);

        int count=10;
        int num=0;
        while (true){
            System.out.println("请输入你要猜的数字");
            int gussNum=scanner.nextInt();

            if(gussNum<randomNum){
                System.out.println("猜的数字小了");
                num++;

                System.out.println("还有"+(count-num)+"机会");
            }else if(gussNum>randomNum){
                System.out.println("猜的数字大了");
                num++;
                System.out.println("还有"+(count-num)+"机会");
            }else{
                System.out.println("恭喜，猜中了！");
                break;
            }


            if(num==count){
                System.out.println("次数已用完");
                break;
            }
        }

        System.out.println("游戏结束");
    }
}
