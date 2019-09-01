package com.imooc.interview.spring;

/**
 * 行李箱类
 */
public class Luggage {

    private Framework framework;

//    Luggage(){
//        this.framework = new Framework();
//    }
//
//    // 因为依赖的Framework类发生了修改
//    Luggage(int size){
//        this.framework = new Framework(size);
//    }

    /** 依赖注入 */
    Luggage(Framework framework){
        this.framework = framework;
    }
}
