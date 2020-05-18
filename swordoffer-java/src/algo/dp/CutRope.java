package algo.dp;

/**
 * @author Louis
 * @date Create in 2019/12/22 12:25
 */
public class CutRope {
    /**
     * 14-剪绳子
     * https://www.nowcoder.com/practice/57d85990ba5b440ab888fc72b0751bf8
     */
    public int cutRope(int target) {
//        // n<=3，进一步划分
//        if(target == 2) {
//            return 1;
//        }
//        if(target == 3) {
//            return 2;
//        }
//        // n>3，不分的情况
//        int[] memo = new int[target+1];
//        memo[1] = 1;
//        memo[2] = 2;
//        memo[3] = 3;
//        // 包括target要等于
//        for(int i=4; i<=target; i++) {
//            for(int j=1; j<=i/2; j++) {
//                memo[i] = Math.max(memo[i], memo[j]*memo[i-j]);
//            }
//        }
//        return memo[target];
        /** 贪心 */
        if (target == 2) {
            return 1;
        }
        if (target == 3) {
            return 2;
        }
        int threeTimes = target / 3;
        // 剩下为4时，要剪成2*2
        if (target - threeTimes * 3 == 1) {
            threeTimes -= 1;
        }
        int twoTimes = (target - threeTimes * 3) / 2;
        return (int) (Math.pow(3, threeTimes) * Math.pow(2, twoTimes));
    }

    /**
     * main
     */
    public static void main(String[] args) {
        System.out.println((new CutRope()).cutRope(8));
    }
}
