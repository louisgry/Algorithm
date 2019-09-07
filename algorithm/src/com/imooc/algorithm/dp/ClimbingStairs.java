package com.imooc.algorithm.dp;

import java.util.Arrays;

public class ClimbingStairs {
    /**
     * 70 Climbing Stairs
     * https://leetcode.com/problems/climbing-stairs/
     * 时间复杂度：O(logn)
     * 空间复杂度：O(1)
     */
    public int climbStairs(int n) {
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

    /**
     * 记忆化搜索memo：自顶向下的解决问题
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
//    int num = 0;
//
//    public int climbStairs(int n) {
//        int[] memo = new int[n+1];
//        Arrays.fill(memo, -1);
//        return climbStairs(n, memo);
//    }
//
//    private int climbStairs(int n, int[] memo) {
//        num++;
//        if(n==1)
//            return 1;
//        if(n==2)
//            return 2;
//        if(memo[n]==-1)
//            memo[n] = climbStairs(n-1, memo) + climbStairs(n-2, memo);
//        return memo[n];
//    }

    // main
    public static void main(String[] args) {
        System.out.println((new ClimbingStairs()).climbStairs(2));
        System.out.println((new ClimbingStairs()).climbStairs(3));
        System.out.println((new ClimbingStairs()).climbStairs(4));
    }
}
