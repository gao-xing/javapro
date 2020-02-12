package com.neuedu.test.bean;

/**
 * Created by 高星 on 2020/2/12.
 */
public class MyThread2 implements Runnable{

    @Override
    public void run() {
        for(int i = 0;i <= 100;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"输出"+i);
        }
    }
}