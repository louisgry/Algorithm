package com.imooc.interview.spring;

/**
 * 箱体类
 */
public class Framework {

    private Bottom bottom;

//    Framework(){
//        this.bottom = new Bottom();
//    }
//
//    // 因为依赖的Bottom类发生了修改
//    Framework(int size){
//        this.bottom = new Bottom(size);
//    }

    /** 依赖注入 */
    Framework(Bottom bottom){
        this.bottom = bottom;
    }
}
