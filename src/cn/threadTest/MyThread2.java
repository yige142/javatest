package cn.threadTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread2 extends Thread{
    //定义共享买票数
    private int ticket=100;
    Lock lock=new ReentrantLock();
    int d=0;

/*
* 使用lock锁
* 1.在成员位置创建 ReentrantLock对象
* 2.在可能会出现线程安全问题地方前调用Lock获取锁
* 3....地方后调用unlock释放锁
* */

    @Override
    public void run() {

         //使用死循环
        while (true){
            lock.lock();
                if(ticket>0){

                    //提高安全问题出现的概率
                    try {
                        Thread.sleep(20);
                        System.out.println(Thread.currentThread().getName()+"-->正在卖"+ticket+"张票");
                        ticket--;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }finally {
                       lock.unlock();
                    }

                }

        }

    }
}
