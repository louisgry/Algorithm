package algo.sort;

import java.util.Arrays;

/**
 * @author Louis
 * @date Create in 2020/3/11 15:13
 */
public class PokerContinuous {
    /**
     * 61-扑克牌顺子
     * - https://www.nowcoder.com/practice/762836f4d43d43ca9deb273b3de8e1f4
     */
    public boolean isContinuous(int[] numbers) {
        // 边界条件判断
        if (numbers.length < 5) {
            return false;
        }
        // 排序预处理
        Arrays.sort(numbers);
        // 统计大小鬼的数量
        int cnt = 0;
        for (int num : numbers) {
            if (num == 0) {
                cnt++;
            }
        }
        // 用大小鬼补全不连续的顺子，从非0元素开始
        for (int i = cnt; i < numbers.length - 1; i++) {
            // 有重复元素，则不能组成顺子
            if (numbers[i + 1] == numbers[i]) {
                return false;
            }
            // 用大小鬼补顺子差，差值大于1才会扣
            cnt -= numbers[i + 1] - numbers[i] - 1;
        }
        // 返回大小王是否补够用
        return cnt >= 0;
    }

    /**
     * main
     */
    public static void main(String[] args) {
        int[] numbers = {2, 0, 1, 0, 4};
        System.out.println((new PokerContinuous()).isContinuous(numbers));
    }
}
