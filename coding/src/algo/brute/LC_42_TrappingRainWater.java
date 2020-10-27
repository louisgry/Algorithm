package algo.brute;

/**
 * @author Louis
 * @date Create in 2020/10/27 14:21
 */
public class LC_42_TrappingRainWater {
    /**
     * 42. 接雨水
     * https://leetcode-cn.com/problems/trapping-rain-water/
     */
    public int trap(int[] height) {
        // 暴力解法：
        int res = 0;
        for(int i=0; i<height.length; i++) {
            int maxLeft = 0, maxRight = 0;
            // 往左：找左边界最大值
            for(int j=i; j>=0; j--) {
                maxLeft = Math.max(maxLeft, height[j]);
            }
            // 往右：找右边界最大值
            for(int j=i; j<height.length; j++) {
                maxRight = Math.max(maxRight, height[j]);
            }
            // res=两边最大高度的最小值-当前高度
            res += Math.min(maxLeft, maxRight) - height[i];
        }
        return res;
    }
    /** main */
    public static void main(String[] args) {
        LC_42_TrappingRainWater solution = new LC_42_TrappingRainWater();
        // case 1: ==> 6
        int[] height1 = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(solution.trap(height1));
        // case 2: ==> 9
        int[] height2 = {4,2,0,3,2,5};
        System.out.println(solution.trap(height2));
    }
}
