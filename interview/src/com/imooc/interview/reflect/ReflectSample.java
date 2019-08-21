package com.imooc.interview.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectSample {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class rc = Class.forName("com.imooc.interview.reflect.Robot");
        Robot r = (Robot) rc.newInstance();
        System.out.println("Class name: " + rc.getName());
        r.sayHi("hello Reflect");

        Method getHello = rc.getDeclaredMethod("throwHello", String.class);
        getHello.setAccessible(true);
        Object str = getHello.invoke(r, "Bob");
        System.out.println("getHello: " + str);

        Method sayHi = rc.getMethod("sayHi", String.class);
        sayHi.invoke(r, "welcome");

        Field name = rc.getDeclaredField("name");
        name.setAccessible(true);
        name.set(r, "Alice");
        sayHi.invoke(r, "welcome");
    }
}
