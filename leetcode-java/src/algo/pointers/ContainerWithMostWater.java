package algo.pointers;

/**
 * @author Louis
 * @date Create in 2019/09/15 11:54
 */
public class ContainerWithMostWater {
    /**
     * 11 Container With Most Water
     * https://leetcode.com/problems/container-with-most-water/
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public int maxArea(int[] height) {
        int area = 0;
        int i = 0;
        int j = height.length-1;
        while(i<j){
            int t = (j-i)*Math.min(height[i], height[j]);
            if(t>area)
                area = t;
            if(height[i]<height[j])
                i++;
            else
                j--;
        }
        return area;
    }

    /** main */
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        // ==> 49
        System.out.println((new ContainerWithMostWater()).maxArea(height));
    }
}
