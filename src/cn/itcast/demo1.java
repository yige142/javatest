package cn.itcast;


import java.util.ArrayList;
import java.util.Scanner;

//public class demo1{

//测试子类继承父类 的构造方法调试
public class demo1 extends Zi{
    public static void main(String[] args)
    {
         Zi zi=new Zi();   // 父类有构造，先输出父类构造里的数据，再是子类。子类没构造直接输出父类构造函数的数据
                           //原因 子类构造方法 内隐含 super();如果没写，编译器会自动隐式加一给super方法，由此先执行父...





//        //测试array 数组
//        ArrayList<String> arrayList= new ArrayList<> ();
//        arrayList.add("小米");
//        arrayList.add("小2");
//        arrayList.add("小3");
//        arrayList.add("小4");
//
//        //遍历
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }





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
