package com.imooc.algorithm.collection;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

/**
 * @Author: Louis
 * @Date: Create in 2019/10/11 21:40
 * @Description:
 */
public class IntersectionOfTwoArraysII {
    /**
     * 350 Intersection of Two Arrays II
     * https://leetcode.com/problems/intersection-of-two-arrays-ii/
     * 思路：Hash Map
     * 时间复杂度：O(nlogn)
     * 空间复杂度：O(n)
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> record = new HashMap<Integer, Integer>();
        for(int num : nums1) {
            if(!record.containsKey(num)) {
                record.put(num, 1);
            }
            else {
                record.put(num, record.get(num)+1);
            }
        }

        List<Integer> result = new ArrayList<Integer>();
        for(int num : nums2) {
            if(record.containsKey(num) && record.get(num)>0) {
                result.add(num);
                record.put(num, record.get(num)-1);
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
        // ==> [2,2]
        int[] res = (new IntersectionOfTwoArraysII()).intersect(nums1, nums2);
        for(int num : res) {
            System.out.print(num + " ");
        }
    }
}
