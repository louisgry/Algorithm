package window;

/**
 * @author Louis
 * @date Create in 2019/9/21 0:54
 */
public class LongestRepeatingCharacterReplacement {
    /**
     * 424 Longest Repeating Character Replacement
     * https://leetcode.com/problems/longest-repeating-character-replacement/
     * 思路：滑动窗口
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public int characterReplacement(String s, int k) {
        int i=0, j=0;
        int max = 0;
        int maxCount = 0;
        int[] freq = new int[256];
        while (j<s.length()) {
            freq[s.charAt(j)]++;
            maxCount = Math.max(maxCount, freq[s.charAt(j)]);
            j++;
            while(j-i-maxCount > k) {
                freq[s.charAt(i++)]--;
            }
            max = Math.max(max, j-i);
        }
        return max;
    }
    /** main */
    public static void main(String[] args) {
        String s1 = "ABAB";
        int k1 = 2;
        System.out.println((new LongestRepeatingCharacterReplacement()).characterReplacement(s1, k1));
        String s2 = "AABABBA";
        int k2 = 1;
        System.out.println((new LongestRepeatingCharacterReplacement()).characterReplacement(s2, k2));
    }
}
