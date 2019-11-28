package dp;

import java.util.Arrays;
/**
 * @author Louis
 * @date Create in 2019/09/079 11:54
 */
public class IntegerBreak {
    /**
     * 343 Integer Break
     * https://leetcode.com/problems/integer-break/
     */
//    private int[] memo;
    public int integerBreak(int n) {
        /**
         * 思路1：记忆化搜索
         * 时间复杂度：O(n^2)
         * 空间复杂度：O(n)
         */
//        memo = new int[n+1];
//        Arrays.fill(memo, -1);
//        return breakInteger(n);

        /**
         * 思路2：动态规划
         * 时间复杂度：O(n^2)
         * 空间复杂度：O(n)
         */
        int[] memo = new int[n+1];
        Arrays.fill(memo, -1);
        memo[1] = 1;
        for(int i=2; i<=n; i++)
            // 求解memo[i]
            for(int j=1; j<=i-1; j++)
                memo[i] = max3(memo[i], j*(i-j), j*memo[i-j]);
        return memo[n];
    }

    // break
//    private int breakInteger(int n){
//        if(n==1)
//            return 1;
//        if(memo[n] != -1)
//            return memo[n];
//        int max = -1;
//        for(int i=1; i<=n-1; i++)
//            max = max3(max, i*(n-i), i*breakInteger(n-i));
//        memo[n] = max;
//        return max;
//    }

    // max3
    private int max3(int a, int b, int c){
        return Math.max(a, Math.max(b, c));
    }

    /** main */
    public static void main(String[] args) {
        System.out.println((new IntegerBreak()).integerBreak(2));
        System.out.println((new IntegerBreak()).integerBreak(10));
    }
}
