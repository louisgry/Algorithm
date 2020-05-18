package baidu;

/**
 * @author Louis
 * @date Create in 2020/3/28 21:02
 * https://exercise.acmcoder.com/online/online_judge_ques?ques_id=3819&konwledgeId=40
 */

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLong()) {
            long n = scan.nextLong();
            long m = scan.nextLong();
            long k = scan.nextLong();
            long left = 0;
            long right = m * n;
            long mid;
            while (left <= right) {
                mid = (left + right) / 2;
                // 要找的数在后面，区间下限继续增大
                if (calVal(mid, m, n) < k) {
                    left = mid + 1;
                }
                // 要找的数在前面，区间上限继续减小
                else {
                    right = mid - 1;
                }
            }
            System.out.println(left);
        }
        scan.close();
    }
    // 计算比x小的数的个数
    private static long calVal(long x, long m, long n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            // min(m,x/i) 是每一行中比x小的数的个数
            // 若i*m<=x,则会有m个数满足要求，否则会有x/i个数满足
            sum += (m<=x/i) ? m : x / i;
        }
        return sum;
    }
}
