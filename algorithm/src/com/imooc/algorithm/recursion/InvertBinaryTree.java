package com.imooc.algorithm.recursion;

/**
 * @Author: Louis
<<<<<<< HEAD
 * @Date: Create in 2019/9/25 14:36
=======
 * @Date: Create in 2019/9/28 10:43
>>>>>>> origin/master
 * @Description:
 */
public class InvertBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
<<<<<<< HEAD
        TreeNode(int x) { val=x; }
=======
        TreeNode(int x) { val = x; }
>>>>>>> origin/master
    }
    /**
     * 226 Invert Binary Tree
     * https://leetcode.com/problems/invert-binary-tree/
<<<<<<< HEAD
     *
=======
     * 思路：递归
     * 时间复杂度：O(n)
     * 空间复杂度：O(h)
>>>>>>> origin/master
     */
    public TreeNode invertTree(TreeNode root) {
        // 递归终止条件
        if (root==null) {
            return null;
        }
<<<<<<< HEAD
=======

>>>>>>> origin/master
        // 递归过程
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        // swap
        root.left = right;
        root.right = left;
        return root;
    }
<<<<<<< HEAD
    /** main */
    public static void main(String[] args) {
        // binary tree [4,2,7,1,3,6,9]
        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
=======

    /** main */
    public static void main(String[] args) {
        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        // binary tree [4,2,7,1,3,6,9]
>>>>>>> origin/master
        TreeNode treeNode = invertBinaryTree.new TreeNode(4);
        treeNode.left = invertBinaryTree.new TreeNode(2);
        treeNode.right = invertBinaryTree.new TreeNode(7);
        treeNode.left.left = invertBinaryTree.new TreeNode(1);
        treeNode.left.right = invertBinaryTree.new TreeNode(3);
        treeNode.right.left = invertBinaryTree.new TreeNode(6);
        treeNode.right.right = invertBinaryTree.new TreeNode(9);
        // ==> binary tree [4,7,2,9,6,3,1]
<<<<<<< HEAD
        TreeNode resultTreeNode = invertBinaryTree.invertTree(treeNode);
        System.out.print(resultTreeNode.val + " ");
        System.out.print(resultTreeNode.left.val + " ");
        System.out.print(resultTreeNode.right.val + " ");
        System.out.print(resultTreeNode.left.left.val + " ");
        System.out.print(resultTreeNode.left.right.val + " ");
        System.out.print(resultTreeNode.right.left.val + " ");
        System.out.print(resultTreeNode.right.right.val);
=======
        TreeNode resultTree = invertBinaryTree.invertTree(treeNode);
        System.out.print(resultTree.val + " ");
        System.out.print(resultTree.left.val + " ");
        System.out.print(resultTree.right.val + " ");
        System.out.print(resultTree.left.left.val + " ");
        System.out.print(resultTree.left.right.val + " ");
        System.out.print(resultTree.right.left.val + " ");
        System.out.print(resultTree.right.right.val + " ");
>>>>>>> origin/master
    }
}
