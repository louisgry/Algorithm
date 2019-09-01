package com.imooc.interview.spring;

/**
 * 轮子类
 */
public class Tire {

    private int size;

    Tire(){
        this.size = 20;
    }

    // 修改构造函数 -> Bottom -> Framework -> Luggage
    Tire(int size){
        this.size = size;
    }
}
