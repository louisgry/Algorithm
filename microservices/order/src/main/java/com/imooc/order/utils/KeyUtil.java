package com.imooc.order.utils;

import java.util.Random;

public class KeyUtil {

    /**
     * 简单生成唯一的主键
     * 格式：时间+随机数
     * synchronized：避免多线程时生成相同的主键
     */
    public static synchronized String genUniqueKey(){
        Random random = new Random();
        Integer number = random.nextInt(900000)+100000;
        return System.currentTimeMillis()+String.valueOf(number);
    }
}
