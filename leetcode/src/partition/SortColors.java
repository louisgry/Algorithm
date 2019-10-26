package partition;

/**
 * @Author: Louis
 * @Date: Create in 2019/09/03 11:54
 * @Description:
 */
public class SortColors {

    /**
     * 75. Sort Colors
     * https://leetcode.com/problems/sort-colors/
     * 思路：使用三路快排partition，只需一次for循环
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public void sortColors(int[] nums){
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

    /** main */
    public static void main(String[] args) {
        int[] nums = {2,2,2,1,1,0};
        (new SortColors()).sortColors(nums);
        for(int i : nums)
            System.out.print(i+" ");
    }
}
