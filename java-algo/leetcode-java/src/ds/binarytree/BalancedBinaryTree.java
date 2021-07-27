package ds.binarytree;

/**
 * @author Louis
 * @date Create in 2019/9/29 17:35
 */
public class BalancedBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 110 Balanced Binary Tree
     * https://leetcode.com/problems/balanced-binary-tree/
     * 思路：
     * 时间复杂度：
     * 空间复杂度：
     */
    public boolean isBalanced(TreeNode root) {
        // 递归终止条件
        if (root == null) {
            return true;
        }
        if (Math.abs(getDepth(root.left) - getDepth(root.right)) > 1) {
            return false;
        }

        // 递归过程
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int getDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(getDepth(root.left), getDepth(root.right));
    }

    /**
     * main
     */
    public static void main(String[] args) {
        BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();
        // binary tree [3,9,20,null,null,15,7]
        TreeNode treeNode = balancedBinaryTree.new TreeNode(3);
        treeNode.left = balancedBinaryTree.new TreeNode(9);
        treeNode.right = balancedBinaryTree.new TreeNode(20);
        treeNode.right.left = balancedBinaryTree.new TreeNode(15);
        treeNode.right.right = balancedBinaryTree.new TreeNode(7);
        // ==> true
        System.out.println(balancedBinaryTree.isBalanced(treeNode));
        // binary tree [1,2,2,3,3,null,null,4,4]
        TreeNode treeNode1 = balancedBinaryTree.new TreeNode(1);
        treeNode1.left = balancedBinaryTree.new TreeNode(2);
        treeNode1.right = balancedBinaryTree.new TreeNode(2);
        treeNode1.left.left = balancedBinaryTree.new TreeNode(3);
        treeNode1.left.right = balancedBinaryTree.new TreeNode(3);
        treeNode1.left.left.left = balancedBinaryTree.new TreeNode(4);
        treeNode1.left.left.right = balancedBinaryTree.new TreeNode(4);
        // ==> false
        System.out.println(balancedBinaryTree.isBalanced(treeNode1));
    }

}
