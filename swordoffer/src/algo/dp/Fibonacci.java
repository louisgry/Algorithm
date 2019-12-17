package algo.dp;

import java.util.Arrays;

/**
 * @author Louis
 * @date Create in 2019/11/12 9:59
 */
public class Fibonacci {
    /**
     * - 10 斐波那契数列
     * - https://www.nowcoder.com/practice/c6c7742f5ba7442aada113136ddea0c3
     */
//    int[] memo;
    public int Fibonacci(int n) {
//        /** 思路1：记忆化搜索 */
//        memo = new int[n+2];
//        Arrays.fill(memo, -1);
//        return getFib(n, memo);

        /** 思路2：动态规划 */
        int[] memo = new int[n+2];
        memo[0] = 0;
        memo[1] = 1;
        for(int i=2; i<=n; i++) {
            memo[i] = memo[i-1] + memo[i-2];
        }
        return memo[n];
    }
//    private int getFib(int n, int[] memo) {
//        if(n == 0) {
//            return 0;
//        }
//        if(n == 1) {
//            return 1;
//        }
//        if(memo[n] == -1) {
//            memo[n] = getFib(n-1, memo) + getFib(n-2, memo);
//        }
//        return memo[n];
//    }
    /** main */
    public static void main(String[] args) {
        System.out.println((new Fibonacci()).Fibonacci(1));
        System.out.println((new Fibonacci()).Fibonacci(2));
        System.out.println((new Fibonacci()).Fibonacci(3));
        System.out.println((new Fibonacci()).Fibonacci(4));
        System.out.println((new Fibonacci()).Fibonacci(5));
    }
}
