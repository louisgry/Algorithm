package algo.window;

/**
 * @author Louis
 * @date Create in 2019/9/5 21:28
 */
public class MinimumSizeSubarraySum {
    /**
     * 209 Minimum Size Subarray Sum
     * https://leetcode.com/problems/minimum-size-subarray-sum/
     * 思路：滑动窗口（维护nums[i...j]，如果sum比s小 sum += nums[++j]，否则sum -= nums[i++]）
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public int minSubArrayLen(int s, int[] nums) {
        // 非空判断
        if(nums==null || nums.length==0) {
            return 0;
        }
        // 右边界不包含任何元素
        int l=0, r=-1;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        while(l < nums.length) {
            if(r+1<nums.length && sum < s) {
                // 需判断是否越界
                sum += nums[++r];
            }
            else {
                sum -= nums[l++];
            }

            if(sum >= s) {
                min = Math.min(min, r-l+1);
            }
        }
        // 返回结果判断，如果没找到为0
        if(min == Integer.MAX_VALUE) {
            return 0;
        }
        return min;
    }
    /** main */
    public static void main(String[] args) {
        int s = 7;
        int[] nums = {2,3,1,2,4,3};
        System.out.println((new MinimumSizeSubarraySum()).minSubArrayLen(s, nums));
    }
}
