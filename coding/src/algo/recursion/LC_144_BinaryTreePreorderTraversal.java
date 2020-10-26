package algo.recursion;

import comm.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Louis
 * @date Create in 2020/10/21 14:33
 */
public class LC_144_BinaryTreePreorderTraversal {
    /**
     * 144. 二叉树的前序遍历
     * https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
     * 思路1：递归
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }
    private void helper(TreeNode root, List<Integer> res) {
        // condition
        if(root == null) {
            return;
        }
        // recursion
        res.add(root.val);
        helper(root.left, res);
        helper(root.right, res);
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
