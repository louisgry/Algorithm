package com.imooc.algorithm.dp;

import java.util.Arrays;

public class ClimbingStairs {
    /**
     * 70 Climbing Stairs
     * https://leetcode.com/problems/climbing-stairs/
     */
//    int[] memo;
    public int climbStairs(int n) {
        /**
         * 记忆化搜索memo：自顶向下的解决问题
         * 时间复杂度：O(n)
         * 空间复杂度：O(n)
         */
//        memo = new int[n+2];
//        Arrays.fill(memo, -1);
//        return climbing(n);
        /**
         * 动态规划：自底向上的解决问题
         * 时间复杂度：O(n)
         * 空间复杂度：O(n)
         */
        int[] memo = new int[n+2];
        Arrays.fill(memo, -1);
        memo[1] = 1;
        memo[2] = 2;
        for(int i=3; i<=n; i++)
            memo[i] = memo[i-1]+memo[i-2];
        return memo[n];
    }

//    public int climbing(int n){
//        if(n==1)
//            return 1;
//        if(n==2)
//            return 2;
//        if(memo[n]==-1)
//            memo[n] = climbing(n-1) + climbing(n-2);
//        return memo[n];
//    }

    // main
    public static void main(String[] args) {
        System.out.println((new ClimbingStairs()).climbStairs(2));
        System.out.println((new ClimbingStairs()).climbStairs(3));
        System.out.println((new ClimbingStairs()).climbStairs(4));
    }
}
