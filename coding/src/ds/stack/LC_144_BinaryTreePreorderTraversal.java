package ds.stack;

import comm.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Louis
 * @date Create in 2020/10/21 14:33
 */
public class LC_144_BinaryTreePreorderTraversal {
    /**
     * 144. 二叉树的前序遍历
     * https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
     * 思路2：栈
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) {
            return res;
        }
        Stack<Command> stack = new Stack<Command>();
        // 先将根节点root入栈
        stack.push(new Command("go", root));
        // 循环遍历
        while (!stack.isEmpty()) {
            // 取出栈顶元素
            Command command = stack.pop();
            // print指令：输出节点值
            if(command.s == "print") {
                res.add(command.node.val);
            }
            // go指令：去下一个节点
            else {
                // 倒序压入栈
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
    public class Command {
        // 指令：print、go
        String s;
        // 作用节点：指令作用的节点
        TreeNode node;
        // 初始化
        Command(String s, TreeNode node) {
            this.s = s;
            this.node = node;
        }
    }
    /** main */
    public static void main(String[] args) {
        LC_144_BinaryTreePreorderTraversal solution = new LC_144_BinaryTreePreorderTraversal();
        // case 1: ==> [1, 2, 3]
        int[] arr1 = {1, 2, 3};
        TreeNode root1 = TreeNode.createTree(arr1, 0);
        System.out.println(solution.preorderTraversal(root1));
        // case 2: ==> [1, 2, 4, 5, 3, 6, 7]
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        TreeNode root2 = TreeNode.createTree(arr2, 0);
        System.out.println(solution.preorderTraversal(root2));
    }
}
