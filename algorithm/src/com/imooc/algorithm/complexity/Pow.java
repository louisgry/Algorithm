package com.imooc.algorithm.complexity;

/**
 * 2-5：递归算法的复杂度分析
 */
public class Pow {

    /**
     * pow函数
     */
    private static double pow(double x, int n){
        assert n >= 0;
        if(n==0)
            return 1.0;
        double t = pow(x, n/2);
        if(n%2==1)
            return x*t*t;

        return t*t;
    }

    // main
    public static void main(String[] args) {
        System.out.println(pow(10, 2));
    }
}
