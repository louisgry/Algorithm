package dp;

import java.util.Arrays;
/**
 * @Author: Louis
 * @Date: Create in 2019/09/09 11:54
 * @Description:
 */
public class PerfectSquares {
    /**
     * 279 Perfect Squares：
     * https://leetcode.com/problems/perfect-squares/
     */
//    int[] memo;
    public int numSquares(int n) {
        /**
         * 思路1：记忆化搜索
         * 时间复杂度：O(n)
         * 空间复杂度：O(n)
         */
//        memo = new int[n+1];
//        Arrays.fill(memo, -1);
//        return squares(n);
        /**
         * 思路2：动态规划
         * 时间复杂度：O(n)
         * 空间复杂度：O(n)
         */
        int[] memo = new int[n+1];
        Arrays.fill(memo, Integer.MAX_VALUE);
        memo[0] = 0;
        for(int i=1; i<=n; i++)
            for(int j=1; i-j*j>=0; j++)
                memo[i] = Math.min(memo[i], 1+memo[i-j*j]);
        return memo[n];
        /**
         * 思路3：queue
         * 时间复杂度：
         * 空间复杂度：
         */

    }
//    private int squares(int n){
//        if(n==0)
//            return 0;
//        if(memo[n] != -1)
//            return memo[n];
//        int min = Integer.MAX_VALUE;
//        for(int i=1; n-i*i>=0; i++)
//            min = Math.min(min, 1+squares(n-i*i));
//        memo[n] = min;
//        return min;
//    }
    /** main */
    public static void main(String[] args) {
        // ==> 3
        System.out.println((new PerfectSquares()).numSquares(12));
        // ==> 2
        System.out.println((new PerfectSquares()).numSquares(13));
    }
}
