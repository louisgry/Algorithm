package algo.dp;

/**
 * @author Louis
 * @date Create in 2020/1/26 22:58
 */
public class NumberEncodeString {
    /**
     * 46-把数字翻译成字符串
     */
    public int numDecodings(String s) {
        if(s==null || s.length()==0) {
            return 0;
        }
        int n = s.length();
        int[] dp = new int[n+1];
        dp[0] = 1;
        // 判断首位是否为零
        dp[1] = s.charAt(0)=='0' ? 0 : 1;
        for(int i=2; i<=n; i++) {
            // 当前位的数字
            int one = Integer.parseInt(s.substring(i-1, i));
            if(one != 0) {
                dp[i] += dp[i-1];
            }
            if(s.charAt(i-2) == '0') {
                continue;
            }
            // 两位数字
            int two = Integer.parseInt(s.substring(i-2, i));
            // 累加次数
            if(two <= 26) {
                dp[i] += dp[i-2];
            }
        }
        return dp[n];
    }
    /** main */
    public static void main(String[] args) {
        // ==> 5
        System.out.println((new NumberEncodeString()).numDecodings("12258"));
    }
}
