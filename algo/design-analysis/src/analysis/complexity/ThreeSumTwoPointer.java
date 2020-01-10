package analysis.complexity;

import java.util.Arrays;

/**
 * @author Louis
 * @date Create in 2019/12/25 22:52
 */
public class ThreeSumTwoPointer implements ThreeSum {
    /**
     * 思路3：双指针，适用于无重复
     * 复杂度：O(n^2)、O(1)
     */
    @Override
    public int countZero(int[] nums) {
        int res = 0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++) {
            int l=i+1, r=nums.length-1;
            int target = -nums[i];
            while(l < r) {
                int sum = nums[l] + nums[r];
                if(sum == target) {
                    res++;
                    l++;
                    r--;
                }
                else if (sum < target) {
                    l++;
                }
                else {
                    r--;
                }
            }
        }
        return res;
    }
}
