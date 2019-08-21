package com.imooc.interview.thread;

public class ThreadTest {
    private static void attack(){
        System.out.println("Fight");
        System.out.println("Current thread is : " + Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(){
            public void run(){
                attack();
            }
        };
        System.out.println("Current main thread is : " + Thread.currentThread().getName());
        t.start(); // ==> Thread-0
//         t.run(); // ==> main
        t.join();
        t.start(); // ==> java.lang.IllegalThreadStateException
    }
}
