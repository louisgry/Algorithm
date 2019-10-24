package window;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Louis
 * @Date: Create in 2019/9/18 21:29
 * @Description:
 */
public class FindAllAnagramsInAString {
    /**
     * 438 Find All Anagrams in a String
     * https://leetcode.com/problems/find-all-anagrams-in-a-string/
     * 思路：滑动窗口
     * 时间复杂度：O(m+n)
     * 空间复杂度：O(1)
     */
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> indexList = new ArrayList<Integer>();
        int i=0, j=0;
        int count = p.length();
        int[] freq = new int[256];
        for (char c : p.toCharArray()){
            freq[c]++;
        }
        while (j < s.length()){
            if (freq[s.charAt(j++)]-- > 0){
                count--;
            }
            if (count == 0){
                indexList.add(i);
            }
            if (j-i==p.length() && freq[s.charAt(i++)]++ >= 0){
                count++;
            }
        }
        return indexList;
    }
    /** main */
    public static void main(String[] args) {
//        String s = "cbaebabacd";
        String s = "cbadbac";
        String p = "abc";
        List<Integer> indexList = (new FindAllAnagramsInAString()).findAnagrams(s, p);
        for (int e : indexList) {
            System.out.print(e + " ");
        }
    }
}
