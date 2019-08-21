package com.imooc.algorithm.complexity;

public class IterationRecursion {

    // 迭代
    private static int sum1(int n){
        assert n>=0;
        int sum = 0;
        for(int i=0; i<=n; i++)
            sum += i;
        return sum;
    }

    // 递归
    private static int sum2(int n){
        assert n>=0;
        if(n==0)
            return 0;
        return n+sum2(n-1);
    }

    public static void main(String[] args) {
        System.out.println(sum1(10000));
        System.out.println(sum2(10000));
    }

}
