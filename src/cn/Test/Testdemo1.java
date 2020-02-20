package cn.Test;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.TooManyListenersException;

public class Testdemo1 {
    //数组反转
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
