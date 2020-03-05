package cn.Test;

import org.junit.Test;


import java.security.Key;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Testdemo1 {
    public static void cc(int a,int b){
        int c= a+b;
        System.out.println(c);
    }

    //调试遍历集合
    @Test
    public void ArrayListTeat(){
        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("E");

        for(String ite : items){
            System.out.println(ite);
        }
    }


    //斗地主发牌 下=====================================================================
    @Test
    public void fapai()
    {
        //1 准备牌
        //创建一给MAP，存储牌的索引和组装好的牌
        HashMap<Integer,String> poker=new HashMap<>();
        //创建一个List集合 ,存储牌的索引
        ArrayList<Integer> pokerIndex=new ArrayList<>();
        //定义两个集合，存储花色和牌的序号
        List<String> colors = new ArrayList<>();
        colors.add("♠");
        colors.add("♥");
        colors.add("♣");
        colors.add("♦");
       // List<String> numbers=new ArrayList<>();
        List<String> numbers=  new ArrayList<>(Arrays.asList("2","A","k","Q","J","10","9","8","7","6","5","4","3"));
       // List<String> numbers= Stream.of("3","4","5").collect(Collectors.toList());//另一个初始化的方法
        //把大王和小王存储到集合中
        //定义一个牌的索引
        int index=0;
        poker.put(index,"大王");
        pokerIndex.add(index);
        index++;
        poker.put(index,"小王");
        pokerIndex.add(index);
        index++;
        //循环嵌套两个集合，组装52张牌，再组装一个存取取牌的数组集合
        for(String number:numbers){
            for(String color:colors){
                poker.put(index,color+number);
                pokerIndex.add(index);
                index ++;
            }
        }

//        System.out.println(poker); //查看扑克组装后详情
//        System.out.println(pokerIndex);  //查看扑克下标

        //遍历花色 查看
//        for(String val:colors){
//            System.out.println(val);
//        }

        //2洗牌
         Collections.shuffle(pokerIndex);
         //System.out.println(pokerIndex);


         //定义4个集合，存储玩家的索引和底牌
        ArrayList<Integer> player01=new ArrayList<>();
        ArrayList<Integer> player02=new ArrayList<>();
        ArrayList<Integer> player03=new ArrayList<>();
        ArrayList<Integer> dipai=new ArrayList<>();

        //3.发牌
        for(int i=0;i<pokerIndex.size();i++){
            Integer in=pokerIndex.get(i);
            //先个底牌发牌
             if(i>=51){
                 dipai.add(in);
             }else if(i%3==0){
                 player01.add(in);
             }else if(i%3==1){
                 player02.add(in);
             }else if(i%3==2){
                 player03.add(in);
             }
        }

        //4 排序玩家已分配到的牌
        Collections.sort(dipai);
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);

//        System.out.println(dipai);
//        System.out.println(player01);
//        System.out.println(player02);
//        System.out.println(player03);

        lookPoker("玩家1:",poker,player01);
        lookPoker("玩家2:",poker,player02);
        lookPoker("玩家3:",poker,player03);
        lookPoker("底牌:",poker,dipai);
      //  colors.add("ff");

    }

    //定义查看方法
    public static void lookPoker(String name,HashMap<Integer,String> poker,ArrayList<Integer> list){
          //输出玩家名字
        System.out.println(name);
        //遍历玩家拿到的牌和底牌
        for(Integer key:list){
            //使用牌的索引 去map结合找对应的牌
            String value=poker.get(key);
            System.out.print(value+" ");
        }
        System.out.println("");
    };
   //测试发牌 上=============================================================================










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
