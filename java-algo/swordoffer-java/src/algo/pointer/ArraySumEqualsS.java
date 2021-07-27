package algo.pointer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Louis
 * @date Create in 2020/2/27 11:42
 */
public class ArraySumEqualsS {
    /**
     * 57.1-和为S的两个数字
     * - https://www.nowcoder.com/practice/390da4f7a00f44bea7c2f3d19491311b
     */
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        int i = 0, j = array.length - 1;
        while (i < j) {
            int t = array[i] + array[j];
            // 最两端的乘积最小
            if (t == sum) {
                return new ArrayList<Integer>(Arrays.asList(array[i], array[j]));
            }
            if (t < sum) {
                i++;
            } else {
                j--;
            }
        }
        return new ArrayList<>();
    }
}
