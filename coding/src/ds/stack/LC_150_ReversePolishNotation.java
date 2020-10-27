package ds.stack;

import java.util.Stack;

/**
 * @author Louis
 * @date Create in 2020/10/27 12:35
 */
public class LC_150_ReversePolishNotation {
    /**
     * 150. 逆波兰表达式求值
     * https://leetcode-cn.com/problems/evaluate-reverse-polish-notation
     */
    public int evalRPN(String[] tokens) {
        // stack存数字，遇到运算符pop。注意减法和除法的处理
        Stack<Integer> stack = new Stack<>();
        for(String elem : tokens) {
            // 加法乘法直接处理
            if(elem.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            }
            else if(elem.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            }
            // 减法和除法注意顺序
            else if(elem.equals("-")) {
                int num = stack.pop();
                stack.push(stack.pop() - num);
            }
            else if(elem.equals("/")) {
                int num = stack.pop();
                stack.push(stack.pop() / num);
            }
            else {
                stack.push(Integer.valueOf(elem));
            }
        }
        // 最后返回栈顶元素
        return stack.pop();
    }
    /** main */
    public static void main(String[] args) {
        LC_150_ReversePolishNotation solution = new LC_150_ReversePolishNotation();
        // case 1: ==> 9
        String[] exp1 = {"2", "1", "+", "3", "*"};
        System.out.println(solution.evalRPN(exp1));
        // case 2: ==> 6
        String[] exp2 = {"4", "13", "5", "/", "+"};
        System.out.println(solution.evalRPN(exp2));
    }
}
