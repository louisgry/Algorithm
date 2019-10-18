package com.imooc.algorithm.binarytree;

/**
 * @Author: Louis
 * @Date: Create in 2019/9/30 15:34
 * @Description:
 */
public class PathSum {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    /**
     * 112 Path Sum
     * https://leetcode.com/problems/path-sum/
     * 思路：递归
     * 时间复杂度：O(n)
     * 空间复杂度：O(h)
     */
    public boolean hasPathSum(TreeNode root, int sum) {
        // 递归终止条件
        if (root == null) {
            return false;
        }
        if (root.left==null && root.right==null) {
            return root.val == sum;
        }
        // 递归过程
        return hasPathSum(root.left, sum-root.val) ||
                hasPathSum(root.right, sum-root.val);
    }
    /** main */
    public static void main(String[] args) {
        PathSum pathSum = new PathSum();

//        // WA: binary tree [], sum=0
//        TreeNode wa = pathSum.new TreeNode(null);
//        // Expected: false
//        System.out.println(pathSum.hasPathSum(wa, 0));

        // binary tree [5,4,8,11,null,13,4,7,2]
        TreeNode treeNode = pathSum.new TreeNode(5);
        treeNode.left = pathSum.new TreeNode(4);
        treeNode.right = pathSum.new TreeNode(8);
        treeNode.left.left = pathSum.new TreeNode(11);
        treeNode.right.left = pathSum.new TreeNode(13);
        treeNode.right.right = pathSum.new TreeNode(4);
        treeNode.left.left.left = pathSum.new TreeNode(7);
        treeNode.left.left.right = pathSum.new TreeNode(2);
        // ==> true
        System.out.println(pathSum.hasPathSum(treeNode, 22));
    }
}
