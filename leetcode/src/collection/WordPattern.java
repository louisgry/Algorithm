package collection;

import java.util.HashMap;

/**
 * @author Louis
 * @date Create in 2019/10/11 23:02
 */
public class WordPattern {
    /**
     * 290 Word Pattern
     * https://leetcode.com/problems/word-pattern/
     * 思路：Hash Map
     * 时间复杂度：O(nlogm)
     * 空间复杂度：O(n+m)
     */
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> map = new HashMap<Character, String>();
        char[] patterns = pattern.toCharArray();
        String[] strs = str.split(" ");

        if(patterns.length != strs.length) {
            return false;
        }

        for(int i=0; i<patterns.length; i++) {
            char c = patterns[i];
            if(!map.containsKey(c)) {
                if(map.containsValue(strs[i])) {
                    return false;
                }
                map.put(c, strs[i]);
            }
            else {
                String value = map.get(c);
                if(!value.equals(strs[i])) {
                    return false;
                }
            }
        }
        return true;
    }
    /** main */
    public static void main(String[] args) {
        String pattern = "abba";
        String str = "dog cat cat dog";
        // ==> true
        System.out.println((new WordPattern()).wordPattern(pattern, str));
    }
}
