package com.imooc.algorithm.collection;

import java.util.HashSet;

/**
 * @Author: Louis
 * @Date: Create in 2019/10/11 20:56
 * @Description:
 */
public class IntersectionOfTwoArrays {
    /**
     * 349 Intersection of Two Arrays
     * https://leetcode.com/problems/intersection-of-two-arrays/
     * 思路：Hash Set
     * 时间复杂度：O(nlogn)
     * 空间复杂度：O(n)
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> record = new HashSet<Integer>();
        for(int num : nums1) {
            record.add(num);
        }

        HashSet<Integer> result = new HashSet<Integer>();
        for(int num : nums2) {
            if(record.contains(num)) {
                result.add(num);
            }
        }

        int[] res = new int[result.size()];
        int index = 0;
        for(Integer num : result) {
            res[index++] = num;
        }
        return res;
    }
    /** main */
    public static void main(String[] args) {
        // Input: nums1 = [1,2,2,1], nums2 = [2,2]
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        // ==> [2]
        int[] res = (new IntersectionOfTwoArrays()).intersection(nums1, nums2);
        for(int num : res) {
            System.out.print(num + " ");
        }
    }
}
