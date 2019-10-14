package com.imooc.algorithm.collection;

import java.util.HashMap;

/**
 * @Author: Louis
 * @Date: Create in 2019/10/11 22:24
 * @Description:
 */
public class ValidAnagram {
    /**
     * 242 Valid Anagram
     * https://leetcode.com/problems/valid-anagram/
     * 思路：Hash Map
     * 时间复杂度：O(n)
     * 空间复杂度：O(26)
     */
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        // HashTable
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++) {
            freq[s.charAt(i)-'a']++;
        }

        for(int i=0; i<t.length(); i++){
            freq[t.charAt(i)-'a']--;
            if(freq[t.charAt(i)-'a'] < 0) {
                return false;
            }
        }
        return true;
    }
//    public boolean isAnagram(String s, String t) {
//        HashMap<Character, Integer> sMap = new HashMap<Character, Integer>();
//        for(int i=0; i<s.length(); i++) {
//            if(!sMap.containsKey(s.charAt(i))) {
//                sMap.put(s.charAt(i), 1);
//            }
//            else {
//                sMap.put(s.charAt(i), sMap.get(s.charAt(i))+1);
//            }
//        }
//        HashMap<Character, Integer> tMap = new HashMap<Character, Integer>();
//        for(int i=0; i<t.length(); i++) {
//            if(!tMap.containsKey(t.charAt(i))) {
//                tMap.put(t.charAt(i), 1);
//            }
//            else {
//                tMap.put(t.charAt(i), tMap.get(t.charAt(i))+1);
//            }
//        }
//        if(sMap.equals(tMap)) {
//            return true;
//        }
//        return false;
//    }
    /** main */
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        // ==> true
        System.out.println((new ValidAnagram()).isAnagram(s, t));
    }
}
