package algo.other;

/**
 * @author Louis
 * @date Create in 2019/12/22 15:34
 */
public class ImplementPower {
    /**
     * 16-数值的整数次方
     * https://www.nowcoder.com/practice/1a834e5e3e1a4b7ba251417554e07c00
     */
    public double Power(double base, int exponent) {
        if (base == 0) {
            return 0.0;
        }
        double res = 1.0;
        int e = Math.abs(exponent);
        for (int i = 0; i < e; i++) {
            res *= base;
        }
        return exponent > 0 ? res : 1 / res;
    }

    /**
     * main
     */
    public static void main(String[] args) {
        System.out.println((new ImplementPower()).Power(2, 3));
        // 负数测试用例
        System.out.println((new ImplementPower()).Power(2, -3));
    }
}
