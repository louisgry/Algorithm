package algo.window;

import java.util.Arrays;

/**
 * @author Louis
 * @date Create in 2020/2/2 13:57
 */
public class LongestNotRepeatedSubstring {
    /**
     * 48-最长不含重复字符的子字符串
     * - https://leetcode.com/problems/longest-substring-without-repeating-characters/
     */
    public int lengthOfLongestSubstring(String s) {
        // 非空判断
        if (s == null || s.length() == 0) {
            return 0;
        }
        // 滑动窗口为s[l...r]
        int l = 0, r = -1;
        // 记录字符频率
        int[] freq = new int[256];
        int max = Integer.MIN_VALUE;

        while (l < s.length()) {
            // 右边界往前移动
            if (r + 1 < s.length() && freq[s.charAt(r + 1)] == 0) {
                // 需判断数组下标是否越界
                freq[s.charAt(++r)]++;
            } else {
                freq[s.charAt(l++)]--;
            }
            max = Math.max(max, r - l + 1);
        }
        return max;
    }

    /**
     * main
     */
    public static void main(String[] args) {
        String str = "arabcacfr";
        System.out.println((new LongestNotRepeatedSubstring()).lengthOfLongestSubstring(str));
    }
}