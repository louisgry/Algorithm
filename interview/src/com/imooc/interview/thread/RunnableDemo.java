package com.imooc.interview.thread;

public class RunnableDemo {
    public static void main(String[] args) {
        MyRunnable mr1 = new MyRunnable("Runnable1");
        MyRunnable mr2 = new MyRunnable("Runnable2");
        MyRunnable mr3 = new MyRunnable("Runnable3");
        Thread t1 = new Thread(mr1);
        Thread t2 = new Thread(mr2);
        Thread t3 = new Thread(mr3);
        t1.start();
        t2.start();
        t3.start();
//        mr1.run();
//        mr2.run();
//        mr3.run();
    }
}
