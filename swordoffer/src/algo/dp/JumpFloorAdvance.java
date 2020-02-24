package algo.dp;

import java.util.Arrays;

/**
 * @author Louis
 * @date Create in 2020/2/24 20:08
 */
public class JumpFloorAdvance {
    /**
     * 10.4-变态跳台阶
     * - https://www.nowcoder.com/practice/22243d016f6b47f2a6928b4313c85387
     */
    public int JumpFloorII(int target) {
        int[] dp = new int[target];
        Arrays.fill(dp, 1);
        // f(n) = 2*f(n-1);
        for(int i=1; i<target; i++) {
            dp[i] = 2*dp[i-1];
        }
        return dp[target-1];
    }
}
