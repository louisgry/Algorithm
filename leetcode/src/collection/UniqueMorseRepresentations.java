package collection;

import java.util.TreeSet;

/**
 * @author Louis
 * @date Create in 2019/10/15 11:04
 */
public class UniqueMorseRepresentations {
    /**
     * 804 Unique Morse Code Words
     * https://leetcode.com/problems/unique-morse-code-words/
     * 思路：使用Set返回不同摩斯码的个数
     * 时间复杂度：O(n+s)
     * 空间复杂度：O(n)
     */
    public int uniqueMorseRepresentations(String[] words) {
        String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        TreeSet<String> set = new TreeSet<String>();
        for(String word : words) {
            StringBuilder res = new StringBuilder();
            for(int i=0; i<word.length(); i++)
                res.append(codes[word.charAt(i)-'a']);
            set.add(res.toString());
        }
        return set.size();
    }
    /** main */
    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        // ==> 2
        System.out.println((new UniqueMorseRepresentations()).uniqueMorseRepresentations(words));
    }
}
