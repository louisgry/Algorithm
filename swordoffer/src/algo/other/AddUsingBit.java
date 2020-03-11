package algo.other;

/**
 * @author Louis
 * @date Create in 2020/3/11 16:06
 */
public class AddUsingBit {
    /**
     * 65-不用加减乘除做加法
     * - https://www.nowcoder.com/practice/59ac416b4b944300b617d4f7f111b215
     */
    public int Add(int num1,int num2) {
        // 异或相当于求和
        // 进位用&和<<1
        int res = 0, carry = 0;
        do {
            res = num1 ^ num2;
            carry = (num1&num2)<<1;
            num1 = res;
            num2 = carry;
        } while(carry != 0);
        return res;
    }
    /** main */
    public static void main(String[] args) {
        System.out.println((new AddUsingBit()).Add(5, 7));
    }
}
