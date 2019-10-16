package com.imooc.algorithm.collection;

import java.util.HashMap;

/**
 * @Author: Louis
 * @Date: Create in 2019/10/12 12:08
 * @Description:
 */
public class TwoSum {
    /**
     * 1 Two Sum
     * https://leetcode.com/problems/two-sum/
     * 思路：将元素a放入Map中，之后查找target-a是否存在
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        for(int i=0; i<nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                res[0] = i;
                res[1] = map.get(complement);
            }
            map.put(nums[i], i);
        }
        return res;
    }
    /** main */
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        // ==> [0,1]
        int[] res = (new TwoSum()).twoSum(nums, target);
        for(int num : res) {
            System.out.print(num + " ");
        }

        int[] nums2 = {3,2,4};
        int target2 = 6;
        // ==> [1,2]
        int[] res2 = (new TwoSum()).twoSum(nums2, target2);
        System.out.println();
        for(int num : res2) {
            System.out.print(num + " ");
        }
    }
}
