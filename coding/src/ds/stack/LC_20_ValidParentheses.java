package ds.stack;

import java.util.Stack;

/**
 * @author Louis
 * @date Create in 2020/10/21 10:50
 */
public class LC_20_ValidParentheses {
    /**
     * 20. 有效的括号
     * https://leetcode-cn.com/problems/valid-parentheses/
     */
    public boolean isValid(String s) {
        char[] charArr = {'(', ')', '{', '}', '[', ']'};
        // 用栈来进行对比
        Stack<Character> stack = new Stack<>();
        // 遍历字符串，一个一个进行判断
        for(int i=0; i<s.length(); i++) {
            char item = s.charAt(i);
            // 左括号：入栈
            if(item == charArr[0] || item == charArr[2] || item == charArr[4]) {
                stack.push(s.charAt(i));
            }
            // 右括号：取出进行对比
            else {
                if(stack.isEmpty()) {
                    return false;
                }
                char left = stack.pop();
                char match;
                if(left == charArr[0]) {
                    match = charArr[1];
                }
                else if(left == charArr[2]) {
                    match = charArr[3];
                }
                else {
                    assert left == charArr[4];
                    match = charArr[5];
                }
                // 对比
                if(match != item) {
                    return false;
                }
            }
        }
        // 如果栈不为空，也是不匹配的
        if(!stack.isEmpty()) {
            return false;
        }
        // 其余情况返回正确
        return true;
    }
    /** main */
    public static void main(String[] args) {
        LC_20_ValidParentheses solution = new LC_20_ValidParentheses();
        // out: true, true, false
        String s1 = "";
        System.out.println(solution.isValid(s1));
        String s2 = "(){}[]";
        System.out.println(solution.isValid(s2));
        String s3 = "(){]";
        System.out.println(solution.isValid(s3));
    }
}
