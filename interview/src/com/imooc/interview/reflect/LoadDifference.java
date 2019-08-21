package com.imooc.interview.reflect;

public class LoadDifference {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader cl = Robot.class.getClassLoader();
        Class r = Class.forName("com.imooc.interview.reflect.Robot");
//        Class.forName("com.mysql.jdbc.Driver");
    }
}
