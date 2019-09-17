package com.imooc.algorithm.window;

public class LongestSubstringWithoutRepeatingCharacters {
    /**
     * 3 Longest Substring Without Repeating Characters
     * https://leetcode.com/problems/longest-substring-without-repeating-characters/
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[256]; // 记录字母是否重复
        int i=0, j=-1;
        int max = 0;
        while(i<s.length()){
            if(j+1<s.length() && freq[s.charAt(j+1)]==0){
                j++;
                freq[s.charAt(j)]++;
            }
            else{
                freq[s.charAt(i)]--;
                i++;
            }
            max = Math.max(max, j-i+1); // 注意：是最长子串max
        }
        return max;
    }

    // main
    public static void main(String[] args) {
        String s1 = "abcabcab";
        System.out.println((new LongestSubstringWithoutRepeatingCharacters()).lengthOfLongestSubstring(s1));
        String s2 = "bbbbb";
        System.out.println((new LongestSubstringWithoutRepeatingCharacters()).lengthOfLongestSubstring(s2));
    }
}
