package ds.stack;

import java.util.Stack;

/**
 * @author Louis
 * @date Create in 2020/1/5 20:29
 */
public class StackPushAndPop {
    /**
     * 31-栈的压入、弹出序列
     * - https://www.nowcoder.com/practice/d77d11405cc7470d82554cb392585106
     */
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA.length==0 || popA.length==0) {
            return false;
        }
        // 序列的下标索引
        int popIndex = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0; i<pushA.length; i++) {
            stack.push(pushA[i]);
            // 如果栈顶元素与popA的相同，则出栈
            while(!stack.isEmpty() && stack.peek()==popA[popIndex]) {
                stack.pop();
                popIndex++;
            }
        }
        // 栈为空，则说明全部匹配
        return stack.isEmpty();
    }
}
