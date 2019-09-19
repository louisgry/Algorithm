package com.imooc.algorithm.window;

/**
 * @Author: Louis
 * @Date: Create in 2019/9/19 23:51
 * @Description:
 */
public class MinimumWindowSubstring {
    /**
     * 76 Minimum Window Substring
     * https://leetcode.com/problems/minimum-window-substring/
     */
    public String minWindow(String s, String t) {
        int[] sFreq = new int[256];
        int count = 0;
        int[] tFreq = new int[256];
        for (int i=0; i<t.length(); i++){
            tFreq[t.charAt(i)]++;
        }
        int minLen = s.length()+1;
        int startIndex = -1;
        int i=0, j=-1;
        while (i<s.length()){
            if (j+1<s.length() && count<t.length()){
                sFreq[s.charAt(j+1)]++;
                if (sFreq[s.charAt(j+1)] <= tFreq[s.charAt(j+1)]){
                    count++;
                }
                j++;
            } else {
                if(count==t.length() && j-i+1<minLen){
                    minLen = j-i+1;
                    startIndex = i;
                }
                sFreq[s.charAt(i)]--
            }
        }

        if (startIndex != -1){
            return s.substring(startIndex, minLen);
        }
        return "";
    }

    /**
     * main
     */
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        // ==> BANC
        System.out.println((new MinimumWindowSubstring()).minWindow(s, t));
    }
}
