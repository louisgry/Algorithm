package algo.recursion;

/**
 * @Author: Louis
 * @Date: Create in 2019/11/12 9:59
 * @Description:
 */
public class Fibonacci {
    /**
     *
     */
    public int Fibonacci(int n) {
        // 动态规划
        int[] memo = new int[n+2];
        if(n == 0) {
            memo[0] = 0;
        }
        else if(n == 1) {
            memo[1] = 1;
        }
        else {
            memo[0] = 0;
            memo[1] = 1;
        }
        for(int i=2; i<=n; i++) {
            memo[i] = memo[i-1] + memo[i-2];
        }
        return memo[n];
    }
    /** main */
    public static void main(String[] args) {
        System.out.println((new Fibonacci()).Fibonacci(3));
    }
}
