package com.imooc.algorithm.window;

import java.util.stream.IntStream;

/**
 * @Author: Louis
 * @Date: Create in 2019/9/20 13:15
 * @Description:
 */
public class PermutationInString {
    /**
     * 567 Permutation in String
     * https://leetcode.com/problems/permutation-in-string/
     * 思路：滑动窗口
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[256];
        for (char c : s1.toCharArray()) {
            freq[c]++;
        }
        int i=0, count=0;
        for (int j=0; j<s2.length(); j++) {
            freq[s2.charAt(j)]--;
            if (freq[s2.charAt(j)] >= 0) {
                count++;
            }
            if (j >= s1.length()) {
                freq[s2.charAt(i)]++;
                if (freq[s2.charAt(i)] >= 1) {
                    count--;
                }
                i++;
            }
            if (count==s1.length()) {
                return true;
            }
        }
        return false;
    }
    /** main */
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        // ==> true
        System.out.println((new PermutationInString()).checkInclusion(s1, s2));

        String s3 = "ab";
        String s4 = "eidboaooo";
        // ==> false
        System.out.println((new PermutationInString()).checkInclusion(s3, s4));
    }

}
