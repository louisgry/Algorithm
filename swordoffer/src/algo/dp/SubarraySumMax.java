package algo.dp;

/**
 * @author Louis
 * @date Create in 2020/1/23 20:22
 */
public class SubarraySumMax {
    /**
     * 42-连续子数组的最大和
     * - https://www.nowcoder.com/practice/459bd355da1549fa8a49e350bf3df484
     */
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array==null || array.length==0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int num : array) {
            if(sum <= 0) {
                sum = num;
            }
            else {
                sum += num;
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
