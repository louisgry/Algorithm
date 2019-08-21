package com.imooc.interview.reflect;

public class ClassLoaderChecker {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        MyClassLoader m = new MyClassLoader("D:/GitHub/Programming/interview/src/com/imooc/interview/reflect/", "myClassLoader");
        Class c = m.loadClass("Wali");
        System.out.println(c.getClassLoader()); // ==> MyClassLoader
        System.out.println(c.getClassLoader().getParent()); // ==> AppClassLoader
        System.out.println(c.getClassLoader().getParent().getParent()); // ==> ExtClassLoader
//        System.out.println(c.getClassLoader().getParent().getParent().getParent()); // ==> null
        c.newInstance();
    }
}
