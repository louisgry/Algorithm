package com.imooc.algorithm.dp;

import java.util.Arrays;

public class PartitionEqualSubsetSum {
    /**
     * 416 Partition Equal Subset Sum
     * https://leetcode.com/problems/partition-equal-subset-sum/
     */
//    int[][] memo; // memo[i][c]: -1是未计算，0是不可填充，1是可以填充
    public boolean canPartition(int[] nums) {
        /**
         * 记忆化搜索
         * 时间复杂度：O(n*sum)
         * 空间复杂度：O(n*sum)
         */
//        int sum = 0;
//        for(int i=0; i<nums.length; i++){
//            assert nums[i]>0;
//            sum += nums[i];
//        }
//        if(sum%2 != 0)
//            return false;
//        memo = new int[nums.length][sum/2+1]; // 表示0...sum/2，故+1
//        for(int i=0; i<nums.length; i++)
//            Arrays.fill(memo[i], -1);
//        return tryPartition(nums, nums.length-1, sum/2);

        /**
         * 动态规划
         * 时间复杂度：O(n*sum)
         * 空间复杂度：O(n*sum)
         */
        int sum = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            assert nums[i]>0;
            sum += nums[i];
        }
        int C = sum/2;
        if(sum%2 != 0)
            return false;
        boolean[] memo = new boolean[C+1]; // 表示0...sum/2
        for(int j=0; j<=C; j++) // 注意是小于等于
            memo[j] = (nums[0] == j); // j -> c
        for(int i=1; i<n; i++)
            for(int j=C; j>=nums[i]; j--)
                memo[j] = memo[j] || memo[j-nums[i]];

        return memo[C];
    }
    // 使用nums[0...index]是否可以完全填满sum的背包
//    private boolean tryPartition(int[] nums, int index, int sum){
//        if(sum==0) // 背包没有空间，即填满了
//            return true;
//        if(sum<0 || index<0)
//            return false;
//        if(memo[index][sum] != -1)
//            return memo[index][sum] == 1;
//        memo[index][sum] = tryPartition(nums, index-1, sum) || tryPartition(nums, index-1, sum-nums[index]) ? 1: 0;
//        return memo[index][sum] == 1;
//    }

    // main
    public static void main(String[] args) {
        int[] nums1 = {1, 5, 11, 5};
        System.out.println((new PartitionEqualSubsetSum()).canPartition(nums1));
        int[] nums2 = {1, 2, 3, 5};
        System.out.println((new PartitionEqualSubsetSum()).canPartition(nums2));
    }
}
