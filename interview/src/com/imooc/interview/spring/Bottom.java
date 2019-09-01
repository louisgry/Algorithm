package com.imooc.interview.spring;

/**
 * 底盘类
 */
public class Bottom {

    private Tire tire;

//    Bottom(){
//        this.tire = new Tire();
//    }
//
//    // 因为依赖的Tire类发生了修改
//    Bottom(int size){
//        this.tire = new Tire(size);
//    }

    /** 依赖注入 */
    Bottom(Tire tire){
        this.tire = tire;
    }
}
