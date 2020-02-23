package cn.Test;

import org.junit.Test;

import java.util.Random;

public class Testdemo1 {

    public static void cc(int a,int b){
        int c= a+b;
        System.out.println(c);
    }


    //测试微信红包算法 下===========
    @Test
    public  void dd(){ //模拟10个红包数
        for (int i=1;i<=10;i++){
            System.out.println(i);
            getRandomMoney();
        }
    }
    //剩余的红包数量
    public int remainSize=10 ;
    //剩余的钱
    public double remainMoney=5 ;


    public  double getRandomMoney() {
        if (this.remainSize == 1) {
            this.remainSize--;
            System.out.println((double) Math.round(this.remainMoney * 100) / 100);
            return (double) Math.round(this.remainMoney * 100) / 100;
        }
        Random r     = new Random();
        double min   = 0.01; //
        double max   = this.remainMoney / this.remainSize * 2;
        double money = r.nextDouble() * max;
        money = money <= min ? 0.01: money;
        money = Math.floor(money * 100) / 100;
        this.remainSize--;
        this.remainMoney -= money;
        System.out.println("还剩多少个红包数："+this.remainSize);
        System.out.println("还有多少余额:"+this.remainMoney);
        System.out.println("返回 抢到红包Money数:"+money);
        System.out.println("=============");
        return money;
    }
    //测试微信红包算法  上=====



    //反转zhuan数组zu数
    @Test
    public void Reversal(){
        int[] array={1,3,4,6,7,8,9};
        int temp=0;
        int c=array.length/2;
       // System.out.println(c);

      for (int i=0 ;i<array.length;i++){
          if(i!=c) {
             for (int j=array.length-(i+1); j>=c;j--){
                     temp = array[i];
                     array[i]=array[j];
                     array[j]=temp;
                 break;
             }

          }
            //System.out.print(array[i]);
        }

        for (int i=0 ;i<array.length;i++){
            System.out.print(array[i]);
        }

    }


    //测速数组
    @Test
    public void TestArr(){
        int[] array={1,2,55};
        System.out.print(array[2]);
    }


    @Test
    public void TestAdd(){
        int a=2;
        int b=3;
        int c=a+b;
        System.out.print(c);
    }

    //测试1-50偶数相加
    @Test
    public void TestForAdd()
    {
        int sum = 0;
        for(int i=1;i<=50;i++){
            if(i%2==0){
                sum=sum + i;
            }
        }
        System.out.print(sum);
    }

}
