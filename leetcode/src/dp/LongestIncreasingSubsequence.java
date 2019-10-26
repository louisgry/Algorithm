package dp;

import java.util.Arrays;
/**
 * @Author: Louis
 * @Date: Create in 2019/09/12 11:54
 * @Description:
 */
public class LongestIncreasingSubsequence {
    /**
     * 300 Longest Increasing Subsequence
     * https://leetcode.com/problems/longest-increasing-subsequence/
     */
    int[] memo;
    public int lengthOfLIS(int[] nums) {
        /**
         * 记忆化搜索
         * 时间复杂度：O(n^2)
         * 空间复杂度：O(n)
         */
        if(nums.length==0)
            return 0;
        memo = new int[nums.length];
        Arrays.fill(memo, -1);
        int max = 0;
        for(int i=0; i<nums.length; i++)
            max = Math.max(max, getMaxLen(nums, i));
        return max;

        /**
         * 动态规划
         * 时间复杂度：O(n^2)
         * 空间复杂度：O(n)
         */
//        if(nums.length==0)
//            return 0;
//        int[] memo = new int[nums.length];
//        Arrays.fill(memo, 1);
//        for(int i=1; i<nums.length; i++)
//            for(int j=0; j<i; j++)
//                if(nums[j]<nums[i])
//                    memo[i] = Math.max(memo[i], 1+memo[j]);
//        int max = 0;
//        for(int i=0; i<nums.length; i++)
//            max = Math.max(max, memo[i]);
//        return max;
    }
    private int getMaxLen(int[] nums, int index){
        if(memo[index] != -1)
            return memo[index];
        int max = 1;
        for(int i=0; i<index; i++)
            if(nums[i] < nums[index])
                max = Math.max(max, 1+getMaxLen(nums, i));
        memo[index] = max;
        return memo[index];
    }

    /** main */
    public static void main(String[] args) {
        int[] nums1 = {10,9,2,5,3,7,101,18};
        System.out.println((new LongestIncreasingSubsequence()).lengthOfLIS(nums1));
    }
}
