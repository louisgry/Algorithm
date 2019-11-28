package stack;

import java.util.Stack;

/**
 * @author Louis
 * @date Create in 2019/10/24 14:21
 */
public class ValidParentheses {
    /**
     * 20 Valid Parentheses
     * https://leetcode.com/problems/valid-parentheses/
     * 思路：使用栈
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<s.length(); i++) {
            // 注意是单引号，char
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[') {
                stack.push(s.charAt(i));
            }
            else {
                if(stack.size() == 0) {
                    return false;
                }
                char c = stack.pop();
                char match;
                if(s.charAt(i)==')') {
                    match = '(';
                }
                else if(s.charAt(i)=='}') {
                    match = '{';
                }
                else {
                    assert s.charAt(i)==']';
                    match = '[';
                }

                if(match != c){
                    return false;
                }
            }
        }
        if(stack.size() != 0) {
            return false;
        }
        return true;
    }
    /** main */
    public static void main(String[] args) {
        String s1 = "()[]{}";
        // ==> true
        System.out.println((new ValidParentheses()).isValid(s1));

        String s2 = "([)]";
        // ==> false
        System.out.println((new ValidParentheses()).isValid(s2));
    }
}
