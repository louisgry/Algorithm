package com.imooc.algorithm.collection;

import java.util.HashMap;

/**
 * @Author: Louis
 * @Date: Create in 2019/10/13 14:22
 * @Description:
 */
public class FourSumII {
    /**
     * 454 4Sum II
     * https://leetcode.com/problems/4sum-ii/
     * 思路：将C+D的所有组合放入Map中
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(n^2)
     */
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer, Integer> record = new HashMap<Integer, Integer>();
        for(int i=0; i<C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                int sum = C[i] + D[j];
                if(!record.containsKey(sum)) {
                    record.put(sum, 1);
                }
                else {
                    record.put(sum, record.get(sum)+1);
                }
            }
        }

        int res = 0;
        for(int i=0; i<A.length; i++) {
            for (int j=0; j<B.length; j++) {
                if(record.containsKey(0-A[i]-B[j])) {
                    res += record.get(0-A[i]-B[j]);
                }
            }
        }
        return res;
    }
    /** main */
    public static void main(String[] args) {
        int[] A = {1, 2};
        int[] B = {-2, -1};
        int[] C = {-1, 2};
        int[] D = {0, 2};
        // ==> 2
        System.out.println((new FourSumII()).fourSumCount(A, B, C, D));
    }
}
