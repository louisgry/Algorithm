package ds.stack;

import java.util.Stack;

/**
 * @Author: Louis
 * @Date: Create in 2019/11/6 17:12
 * @Description:
 */
public class TwoStackImplementQueue {
    /**
     * 9 用两个栈来实现队列
     * https://www.nowcoder.com/practice/54275ddae22f475981afa2244dd448c6
     */
    private Stack<Integer> stack1 = new Stack<Integer>();
    private Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        while(!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(node);
        while(!stack2.empty()) {
            stack1.push(stack2.pop());
        }
    }

    public int pop() {
        return stack1.pop();
    }
}
