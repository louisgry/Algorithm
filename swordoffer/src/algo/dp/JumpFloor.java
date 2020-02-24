package algo.dp;

/**
 * @author Louis
 * @date Create in 2020/2/24 20:07
 */
public class JumpFloor {
    /**
     * 10.3-跳台阶
     * - https://www.nowcoder.com/practice/8c82a5b80378478f9484d87d1c5f12a4
     */
    public int JumpFloor(int target) {
        if(target<=0) {
            return -1;
        }
        int[] dp = new int[target+2];
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3; i<=target; i++) {
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[target];
    }
}
