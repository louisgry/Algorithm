package com.imooc.algorithm.partition;

public class SortColors {

    /**
     * 75. Sort Colors
     * https://leetcode.com/problems/sort-colors/
     */
    public void sortColors(int[] nums){

        /**
         * 思路1：调用Arrays.sort（快排）
         * 时间复杂度：O(nlogn)
         * 空间复杂度：O(1)
         */
//        Arrays.sort(nums);


        /**
         * 思路2：使用计数排序：count各种颜色总数分别有多少，然后按顺序放回
         * 时间复杂度：O(n)
         * 空间复杂度：O(k)
         */
//        // count for 0,1,2
//        int[] count = {0,0,0};
//        for(int i=0; i<nums.length; i++){
//            assert(nums[i]>=0 && nums[i]<=2);
//            count[nums[i]]++;
//        }
//        // sort
//        int index=0;
//        for(int i=0; i<count[0]; i++)
//            nums[index++] = 0;
//        for(int i=0; i<count[1]; i++)
//            nums[index++] = 1;
//        for(int i=0; i<count[2]; i++)
//            nums[index++] = 2;

        /**
         * 思路3：使用三路快排：只需一次for循环
         * 时间复杂度：O(n)
         * 空间复杂度：O(1)
         */
        int zero = -1;
        int two = nums.length;
        for(int i=0; i<two; ){
            // 1
            if(nums[i]==1)
                i++;
            // 2
            else if(nums[i]==2){
                two--;
                swap(nums, i, two);
            }
            // 0
            else{
                assert nums[i]==0;
                zero++;
                swap(nums, i, zero);
                i++;
            }
        }

    }

    // swap
    public void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    // main
    public static void main(String[] args) {
        int[] nums = {2,2,2,1,1,0};
        (new SortColors()).sortColors(nums);
        for(int i : nums)
            System.out.print(i+" ");
    }
}
