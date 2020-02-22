package cn.itcast;


import java.util.ArrayList;
import java.util.Scanner;

public class demo1{
    public static void main(String[] args)
    {
        //测试array 数组
        ArrayList<String> arrayList= new ArrayList<> ();
        arrayList.add("小米");
        arrayList.add("小2");
        arrayList.add("小3");
        arrayList.add("小4");

        //遍历
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }





        //测试scanner类 两ou两键盘数相加
//        Scanner scan=new Scanner(System.in);
//        System.out.println("输加一个数字" );
//        int a=scan.nextInt();
//        System.out.println("再输输入一个数字");
//        int b=scan.nextInt();
//        int result=a+b;
//        System.out.println("结果是" +result);



           // System.out.print(123);
    }

}
