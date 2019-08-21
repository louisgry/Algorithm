package com.imooc.interview.thread;

public class CASCase {
    public volatile int value;

    // 需加上synchronized
    public synchronized void add(){
        value++;
    }
}
