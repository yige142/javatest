package cn.threadTest;

public class demo27 {
    public static void main(String[] args) {
        //调测synchronized 同步代码块
       // MyThread myThread=new MyThread();

        //Lock 同步代码块
         MyThread2 myThread= new MyThread2();
        Thread t1=new Thread(myThread);
        Thread t2=new Thread(myThread);
        Thread t3=new Thread(myThread);
        t1.start();
        t2.start();
        t3.start();

    }
}
