package com.imooc.algorithm.array;

public class MoveZeroes {

    /**
     * 283. Move Zeroes
     * https://leetcode.com/problems/move-zeroes/
     * 时间复杂度：
     * 空间复杂度：
     */
    public void moveZeroes(int[] nums){
//        int index = 0;
//        for(int i=0; i<nums.length; i++){
//            if(nums[i]==0){
//                nums[i]=nums[i++];
//                nums[i++]=0;
//                index++;
//            }
//
//        }
//        for (int i=0; i<index; i++)
//            nums[nums.length-1-i]=0;
    }

    // main
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        (new MoveZeroes()).moveZeroes(arr);
        for(int i=0; i<arr.length; i++)
            System.out.print(i + ", ");
        System.out.println();

    }
}
