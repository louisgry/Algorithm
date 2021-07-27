package ds.stack;

import java.util.Stack;

/**
 * @author Louis
 * @date Create in 2019/11/6 17:12
 */
public class TwoStackImplementQueue {
    /**
     * 9 用两个栈来实现队列
     * https://www.nowcoder.com/practice/54275ddae22f475981afa2244dd448c6
     */
    private Stack<Integer> stack1 = new Stack<Integer>();
    private Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
