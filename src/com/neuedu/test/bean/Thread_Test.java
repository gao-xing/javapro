package com.neuedu.test.bean;

/**
 * Created by 高星 on 2020/2/12.
 */
public class Thread_Test {
    public static void main(String[] args) {
//        MyThread t1 = new MyThread();
//        t1.start();
//       // t1.run();//只是调用得一个方法 要用start方法启动线程 启动之后 入口就是run
//        MyThread t2 = new MyThread();
//        t2.start();
        MyThread2 t2 = new MyThread2();
        Thread t = new Thread(t2);
        t.start();
    }
}
