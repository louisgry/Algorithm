package com.imooc.interview.thread;

public class StringBufferWithoutSync {
    public void add(String str1, String str2){
        // StringBuffer是线程安全的
        // 因为append实现synchronized的同步方法，当前只会有一个线程
        StringBuffer sb = new StringBuffer();
        sb.append(str1).append(str2);
    }

    public static void main(String[] args) {
        StringBufferWithoutSync withoutSync = new StringBufferWithoutSync();
        for (int i=0; i<1000; i++){
            withoutSync.add("aaa", "bbb");
        }
    }
}
