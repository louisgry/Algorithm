package com.imooc.algorithm.cursor;

public class MoveZeroes {

    /**
     * 283. Move Zeroes
     * https://leetcode.com/problems/move-zeroes/
     */
    public void moveZeroes(int[] nums){
        /**
         * 思路1：两个for循环，第一个for找0，第二个找非0，然后swap
         * 时间复杂度：O(n^2)
         * 空间复杂度：O(1)
         */
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
        /**
         * 思路2：用一个List存非零元素，然后把nums的最后几位置为0
         * 时间复杂度：O(n)
         * 空间复杂度：O(n)
         */
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
        /**
         * 思路3：采用原地算法，不使用List，用游标k替代
         * 时间复杂度：O(n)
         * 空间复杂度：O(1)
         */
//        int k = 0;
//        for(int i=0; i<nums.length; i++)
//            if(nums[i]!=0)
//                nums[k++] = nums[i];
//        for(int i=k; i<nums.length; i++)
//            nums[i] = 0;

        /**
         * 思路4：直接交换0和非0
         * 时间复杂度：O(n)
         * 空间复杂度：O(1)
         */
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
        // ==>
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

    }
}
