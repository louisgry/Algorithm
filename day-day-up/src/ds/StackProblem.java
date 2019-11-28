package ds;
import java.util.*;

/**
 * @author Louis
 * @date Create in 2019/11/26 20:01
 */
public class StackProblem {

    /**
     * https://leetcode.com/problems/binary-tree-preorder-traversal/
     */
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        // 非递归
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null) {
            return res;
        }
        Stack<Command> stack = new Stack<>();
        stack.push(new Command("go", root));
        while(!stack.empty()) {
            Command command = stack.pop();
            if(command.s == "print") {
                res.add(command.node.val);
            }
            else {
                if(command.node.right != null) {
                    stack.push(new Command("go", command.node.right));
                }
                if(command.node.left != null) {
                    stack.push(new Command("go", command.node.left));
                }
                stack.push(new Command("print", command.node));
            }
        }
        return res;
    }
    private class Command {
        String s; // go, print
        TreeNode node;
        Command(String s, TreeNode node) {
            this.s = s;
            this.node = node;
        }
    }

    /**
     * https://leetcode.com/problems/valid-parentheses/
     */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] matchs = {'(', '[', '{'};
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{') {
                stack.push(s.charAt(i));
            }
            else {
                if(stack.size()==0) {
                    return false;
                }
                char c;
                if(s.charAt(i) == ')') {
                    c = matchs[0];
                }
                else if(s.charAt(i) == ']') {
                    c = matchs[1];
                }
                else {
                    c = matchs[2];
                }
                if(c!=stack.pop()) {
                    return false;
                }
            }
        }
        if(!stack.isEmpty()) {
            return false;
        }
        return true;
    }

    /** common */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
