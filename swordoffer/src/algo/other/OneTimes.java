package algo.other;

/**
 * @author Louis
 * @date Create in 2019/12/22 15:19
 */
public class OneTimes {
    /**
     * 15-二进制中1的个数
     * https://www.nowcoder.com/practice/8ee967e43c2c4ec193b040ea7fbb10b8
     */
    public int NumberOf1(int n) {
        int count = 0;
        while(n != 0) {
            count++;
            n = (n-1)&n;
        }
        return count;
    }
}
