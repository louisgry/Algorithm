package algo.window;

/**
 * @author Louis
 * @date Create in 2019/9/17 21:28
 */
public class LongestSubstringWithoutRepeatingCharacters {
    /**
     * 3 Longest Substring Without Repeating Characters
     * https://leetcode.com/problems/longest-substring-without-repeating-characters/
     * 思路：滑动窗口
     * 时间复杂度：O(n)
     * 空间复杂度：O(len(charset))
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
        String s1 = "abcabcab";
        System.out.println((new LongestSubstringWithoutRepeatingCharacters()).lengthOfLongestSubstring(s1));
        String s2 = "bbbbb";
        System.out.println((new LongestSubstringWithoutRepeatingCharacters()).lengthOfLongestSubstring(s2));
    }
}
