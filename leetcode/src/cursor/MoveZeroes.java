package cursor;

/**
 * @Author: Louis
 * @Date: Create in 2019/09/01 11:54
 * @Description:
 */
public class MoveZeroes {
    /**
     * 283. Move Zeroes
     * https://leetcode.com/problems/move-zeroes/
     * 思路：采用原地算法，用游标k，直接交换0和非0
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public void moveZeroes(int[] nums){
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

    /** main */
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        (new MoveZeroes()).moveZeroes(arr);
        // ==>
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

    }
}
