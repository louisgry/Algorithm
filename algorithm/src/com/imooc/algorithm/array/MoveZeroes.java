package com.imooc.algorithm.array;

import java.util.ArrayList;
import java.util.List;

public class MoveZeroes {

    /**
     * 283. Move Zeroes
     * https://leetcode.com/problems/move-zeroes/
     * 时间复杂度：
     * 空间复杂度：
     */
    public void moveZeroes(int[] nums){
//        // swap 0和非0
//        // 时间复杂度：O(n^2)
//        // 空间复杂度：O(1)
//        for (int i=0; i<nums.length; i++){
//            if(nums[i]==0){
//                for(int j=i+1; j<nums.length; j++){
//                    if(nums[j]!=0){
//                        int t = nums[j];
//                        nums[j] = nums[i];
//                        nums[i] = t;
//                        break;
//                    }
//                }
//            }
//        }
//
//        // 直接取出非0元素放在前面
//        // 时间复杂度：O(n)
//        // 空间复杂度：O(n)
//        List<Integer> nonZeroList = new ArrayList<Integer>();
//        for(int i=0; i<nums.length; i++){
//            if(nums[i]!=0)
//                nonZeroList.add(nums[i]);
//        }
//
//        for(int i=0; i<nonZeroList.size(); i++){
//            nums[i] = nonZeroList.get(i);
//        }
//
//        for(int i=nonZeroList.size(); i<nums.length; i++){
//            nums[i] = 0;
//        }
//
//        // 优化1：原地，不用O(n)的空间
//        // 时间复杂度：O(n)
//        // 空间复杂度：O(1)
//        int k = 0;
//        for(int i=0; i<nums.length; i++)
//            if(nums[i]!=0)
//                nums[k++] = nums[i];
//        for(int i=k; i<nums.length; i++)
//            nums[i] = 0;

        // 优化2：swap 0和非0（用游标k，就不用再for循环了）
        // 时间复杂度：O(n)
        // 空间复杂度：O(1)
        int k = 0;
        for(int i=0; i<nums.length; i++)
            if(nums[i]!=0){
                // swap(nums[i], nums[k])
                if(i!=k){
                    int t = nums[i];
                    nums[i] = nums[k];
                    nums[k] = t;
                    k++;
                }
                else // i==k
                    k++;
            }
    }

    // main
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        (new MoveZeroes()).moveZeroes(arr);
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

    }
}
