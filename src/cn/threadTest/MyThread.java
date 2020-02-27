package cn.threadTest;

public class MyThread extends Thread{
    //定义共享买票数
    private int ticket=100;

    Object obj=new Object();

    /*
    * synchronized(锁对象){
    *   大括号里  可能会出现线程安全问题的代码
    * }
    *
    *注意：
    *   1.通过代码块中的锁对象，可以是任意的对象
    *   2.使用任意锁对象的同时得保证锁 的对象是  同一个！
    *   3.锁对象的作用：把同步代码块锁住，只让一给线程在代码块中执行
    *
    * */

    @Override
    public void run() {
         //使用死循环
        while (true){
            //同步代码块
          synchronized (obj){
                if(ticket>0){
                    //提高安全问题出现的概率
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName()+"-->正在卖"+ticket+"张票");
                    ticket--;
                }
           }

        }
    }
}
