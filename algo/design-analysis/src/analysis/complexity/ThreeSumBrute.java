package analysis.complexity;

/**
 * @author Louis
 * @date Create in 2019/12/25 22:39
 */
public class ThreeSumBrute implements ThreeSum {
    /**
     * 思路1：暴力解法，直接for循环三次
     * 复杂度：O(n^3)、O(1)
     */
    @Override
    public int countZero(int[] nums) {
        int res = 0;
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                for(int k=j+1; k<nums.length; k++) {
                    if(nums[i]+nums[j]+nums[k] == 0) {
                        res++;
                    }
                }
            }
        }
        return res;
    }
}
