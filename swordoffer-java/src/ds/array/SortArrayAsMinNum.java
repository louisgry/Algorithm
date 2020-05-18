package ds.array;

import java.util.Arrays;

/**
 * @author Louis
 * @date Create in 2020/1/26 21:09
 */
public class SortArrayAsMinNum {
    /**
     * 45-把数组排列成最小的数
     * - https://www.nowcoder.com/practice/8fecd3f8ba334add803bf2a06af1b993
     */
    public String PrintMinNumber(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return "";
        }
        int n = numbers.length;
        // 转换为字符串数组
        String[] nums = new String[n];
        for (int i = 0; i < n; i++) {
            nums[i] = numbers[i] + "";
        }
        // 字符串数组排序：比较s1+s2和s2+s1的大小
        Arrays.sort(nums, (s1, s2) -> (s1 + s2).compareTo(s2 + s1));
        String res = "";
        for (String num : nums) {
            res += num;
        }
        return res;
    }

    /**
     * main
     */
    public static void main(String[] args) {
        // ==> 321323
        int[] nums = {3, 32, 321};
        System.out.println((new SortArrayAsMinNum()).PrintMinNumber(nums));
    }
}
