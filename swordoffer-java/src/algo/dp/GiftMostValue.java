package algo.dp;

/**
 * @author Louis
 * @date Create in 2020/2/1 22:41
 */
public class GiftMostValue {
    /**
     * 47-礼物的最大值
     * https://www.nowcoder.com/questionTerminal/72a99e28381a407991f2c96d8cb238ab
     */
    public int getMost(int [][] values) {
        if(values==null || values.length==0 || values[0].length==0) {
            return 0;
        }
        int n = values[0].length;
        int[] dp = new int[n];
        for(int[] value : values) {
            dp[0] += value[0];
            for(int i=1; i<n; i++) {
                dp[i] = Math.max(dp[i], dp[i-1]) + value[i];
            }
        }
        return dp[n-1];
    }
    /** main */
    public static void main(String[] args) {
        int[][] values = {{1,10,3,8},{12,2,9,6}, {5,7,4,11},{3,7,16,5}};
        System.out.println((new GiftMostValue()).getMost(values));
    }
}
