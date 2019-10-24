package dp;

import java.util.Arrays;

public class Fibonacci {
    /**
     * 斐波那契数列
     */
    public int fib(int n){
        /**
         * 递归
         * 时间复杂度：O(2^n) 指数级
         * 空间复杂度：O(1)
         */
//        if(n==0)
//            return 0;
//        if(n==1)
//            return 1;
//        return fib(n-1) + fib(n-2);

        /**
         * 记忆化搜索
         * 时间复杂度：O(n)
         * 空间复杂度：O(n)
         */
//        int[] memo = new int[n+1];
//        Arrays.fill(memo, -1);
//        // 新增一个fib方法
//        return fib(n, memo);

        /**
         * 动态规划
         * 时间复杂度：O(n)
         * 空间复杂度：O(n)
         */
        int[] memo = new int[n+1];
        Arrays.fill(memo, -1);
        memo[0] = 0;
        memo[1] = 1;
        for(int i=2; i<=n; i++)
            memo[i] = memo[i-1]+memo[i-2];
        return memo[n];
    }
    // 记忆化搜索
    private int fib(int n, int[] memo){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        if(memo[n]==-1)
            memo[n] = fib(n-1) + fib(n-2); // 用memo存储重复计算的值
        return memo[n];

    }

    /** main */
    public static void main(String[] args) {
        System.out.println((new Fibonacci()).fib(2));
        System.out.println((new Fibonacci()).fib(3));
        System.out.println((new Fibonacci()).fib(4));
    }
}
