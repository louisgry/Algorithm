package dp;

import java.util.Arrays;
/**
 * @Author: Louis
 * @Date: Create in 2019/09/10 12:17
 * @Description:
 */
public class DecodeWays {
    /**
     * 91 Decode Ways
     * https://leetcode.com/problems/decode-ways/
     */
    int[] memo;
    public int numDecodings(String s) {
        /**
         * 思路1：记忆化搜索
         * 时间复杂度：O(n)
         * 空间复杂度：O(n)
         */
        memo = new int[s.length()+1];
        Arrays.fill(memo, -1);
        memo[s.length()] = 1;
        return getNum(s, 0);

        /**
         * 思路2：动态规划
         * 时间复杂度：O(n)
         * 空间复杂度：O(n)
         */
//        int n = s.length();
//        if(n == 0) {
//            return 0;
//        }
//        int[] memo = new int[n+1];
//        memo[n] = 1;
//        memo[n-1] = s.charAt(n-1)=='0' ? 0 : 1;
//        for(int i=n-2; i>=0; i--) {
//            if(s.charAt(i) == '0') {
//                continue;
//            }
//            else {
//                memo[i] = Integer.parseInt(s.substring(i, i+2)) <= 26 ? memo[i+1] + memo[i+2] : memo[i+1];
//            }
//        }
//        return memo[0];
    }
    private int getNum(String s, int i) {
        int n = s.length();
        if(n == 0) {
            return 0;
        }
        if(memo[i] > -1) {
            return memo[i];
        }
        if(s.charAt(i) == '0') {
            return memo[i] = 0;
        }
        int res = getNum(s, i+1);
        if(i<s.length()-1 && Integer.parseInt(s.substring(i, i+2)) <= 26) {
            res += getNum(s, i+2);
        }
        return memo[i] = res;
    }
    /** main */
    public static void main(String[] args) {
        String s1 = "12";
        // ==> 2
        System.out.println((new DecodeWays()).numDecodings(s1));

        String s2 = "226";
        // ==> 3
        System.out.println((new DecodeWays()).numDecodings(s2));
    }
}
