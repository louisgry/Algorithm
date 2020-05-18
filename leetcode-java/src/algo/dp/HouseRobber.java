package algo.dp;

import java.util.Arrays;

/**
 * @author Louis
 * @date Create in 2019/09/08 11:54
 */
public class HouseRobber {
    /**
     * 198 House Robber
     * https://leetcode.com/problems/house-robber/
     */
//    int[] memo;
    public int rob(int[] nums) {
        /**
         * 思路1：记忆化搜索
         * 时间复杂度：O(n^2)
         * 空间复杂度：O(n)
         */
//        memo = new int[nums.length];
//        Arrays.fill(memo, -1);
//        return tryRobber(nums, 0);
        /**
         * 思路2：动态规划
         * 时间复杂度：O(n^2)
         * 空间复杂度：O(n)
         */
        int n = nums.length;
        if (n == 0)
            return 0;
        int[] memo = new int[n];
        Arrays.fill(memo, -1);
        memo[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            // memo[i]
            for (int j = i; j < n; j++)
//                memo[i] = Math.max(memo[i], nums[j] + memo[j+2]);
                memo[i] = Math.max(memo[i], nums[j] + (j + 2 < n ? memo[j + 2] : 0));
        }
        return memo[0];
    }
    // 考虑抢劫[x...n-1]
//    private int tryRobber(int[] nums, int index){
//        if(index >= nums.length)
//            return 0;
//        if(memo[index] != -1)
//            return memo[index];
//        int max = 0;
//        for(int i=index; i<nums.length; i++)
//            max = Math.max(max, nums[i] + tryRobber(nums, i+2));
//        memo[index] = max;
//        return max;
//    }

    /**
     * main
     */
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        System.out.println((new HouseRobber()).rob(nums1));
        int[] nums2 = {2, 7, 9, 3, 1};
        System.out.println((new HouseRobber()).rob(nums2));
    }
}
