package com.imooc.algorithm.dp;

import java.util.Arrays;

public class LongestCommonSubsequence {
    /**
     * 1143 Longest Common Subsequence
     * https://leetcode.com/problems/longest-common-subsequence/
     */
//    private int[][] memo;
    public int longestCommonSubsequence(String text1, String text2) {
        /**
         * 记忆化搜索
         * 时间复杂度：O(m*n)
         * 空间复杂度：O(m*n)
         */
//        assert text1!=null && text2!=null;
//        if(text1.length()==0 || text2.length()==0)
//            return 0;
//        memo = new int[text1.length()][text2.length()];
//        for(int i=0; i<text1.length(); i++)
//            Arrays.fill(memo[i], -1);
//        return lcs(text1, text2, text1.length()-1, text2.length()-1);
        /**
         * 动态规划
         * 时间复杂度：O(m*n)
         * 空间复杂度：O(m*n)
         */
        int m = text1.length();
        int n = text2.length();
        int memo[][] = new int[m][n];
        // init
        for(int i=0; i<m; i++)
            if(text1.charAt(i)==text2.charAt(0)){
                for(int j=i; j<m; j++)
                    memo[j][0] = 1;
                break;
            }
        for(int i=0; i<n; i++)
            if(text1.charAt(0)==text2.charAt(i)){
                for(int j=i; j<n; j++)
                    memo[0][j] = 1;
                break;
            }
        // dp
        for(int i=1; i<m; i++)
            for(int j=1; j<n; j++)
                if(text1.charAt(i) == text2.charAt(j))
                    memo[i][j] = 1 + memo[i-1][j-1];
                else
                    memo[i][j] = Math.max(memo[i-1][j], memo[i][j-1]);
        return memo[m-1][n-1];
    }
    // 求s1[0...m]和s2[0...n]的最长公共子序列的长度
//    private int lcs(String s1, String s2, int m, int n){
//        if(m<0 || n<0)
//            return 0;
//        if(memo[m][n] != -1)
//            return memo[m][n];
//        int max = 0;
//        if(s1.charAt(m)==s2.charAt(n))
//            max = 1 + lcs(s1, s2, m-1, n-1);
//        else
//            max = Math.max(lcs(s1, s2, m-1, n), lcs(s1, s2, m, n-1));
//        memo[m][n] =max;
//        return max;
//    }

    // main
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";
        System.out.println((new LongestCommonSubsequence()).longestCommonSubsequence(s1, s2));
    }
}
