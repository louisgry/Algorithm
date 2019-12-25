package analysis.complexity;

import java.util.Arrays;

/**
 * @author Louis
 * @date Create in 2019/12/25 22:41
 */
public class ThreeSumBinarySearch implements ThreeSum {
    /**
     * 思路2：二分搜索，不含重复元素时可用
     * 复杂度：O(n^2logn)、O(1)
     */
    @Override
    public int countZero(int[] nums) {
        int res = 0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                int target = nums[i]+nums[j];
                int index = binarySearch(nums, 0-target);
                // 不能在j前面，不然会重复统计
                if(index > j) {
                    res++;
                }
            }
        }
        return res;
    }
    private int binarySearch(int[] nums, int target) {
        int l=0, r=nums.length-1;
        while(l <= r) {
            int mid = l+(r-l)/2;
            if(nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] < target) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        throw new IllegalStateException("No solution");
    }
}
