package algo.dp;

/**
 * @author Louis
 * @date Create in 2020/2/3 23:34
 */
public class UglyNumber {
    /**
     * 49-丑数
     * - https://www.nowcoder.com/practice/6aa9e04fc3794f68acf8778237ba065b
     */
    public int GetUglyNumber_Solution(int index) {
        // 丑数：因子只含2,3,5
        if (index <= 6) {
            return index;
        }
        int i2 = 0, i3 = 0, i5 = 0;
        int[] dp = new int[index];
        // 1是第一个丑数
        dp[0] = 1;
        for (int i = 1; i < index; i++) {
            int two = dp[i2] * 2, three = dp[i3] * 3, five = dp[i5] * 5;
            // 取三者的最小值
            dp[i] = Math.min(two, Math.min(three, five));
            // 丑数 = 2^x * 3^y * 5^z
            if (dp[i] == two) {
                i2++;
            }
            if (dp[i] == three) {
                i3++;
            }
            if (dp[i] == five) {
                i5++;
            }
        }
        return dp[index - 1];
    }

    /**
     * main
     */
    public static void main(String[] args) {
        // ==> 8
        System.out.println((new UglyNumber()).GetUglyNumber_Solution(7));
    }
}
