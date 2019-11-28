package binarytree;

/**
 * @author Louis
 * @date Create in 2019/9/25 1:11
 */
public class MinimumDepthOfBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val=x; }
    }
    /**
     * 111 Minimum Depth of Binary Tree
     * https://leetcode.com/problems/minimum-depth-of-binary-tree/
     * 思路：递归
     * 时间复杂度：O(n)
     * 空间复杂度：O(h)
     */
    public int minDepth(TreeNode root) {
        // 递归终止条件
        if (root==null) {
            return 0;
        }
        if (root.left==null && root.right==null) {
            return 1;
        }
        // 递归过程
        int min = Integer.MAX_VALUE;
        if (root.left!=null) {
            min = Math.min(min, minDepth(root.left)+1);
        }
        if (root.right!=null) {
            min = Math.min(min, minDepth(root.right)+1);
        }
        return min;
    }
    /** main */
    public static void main(String[] args) {
        MinimumDepthOfBinaryTree minimumDepthOfBinaryTree = new MinimumDepthOfBinaryTree();
        // Binary Tree [3,9,20,null,null,15,7]
        TreeNode treeNode = minimumDepthOfBinaryTree.new TreeNode(3);
        treeNode.left = minimumDepthOfBinaryTree.new TreeNode(9);
        treeNode.right = minimumDepthOfBinaryTree.new TreeNode(20);
        treeNode.right.left = minimumDepthOfBinaryTree.new TreeNode(15);
        treeNode.right.right = minimumDepthOfBinaryTree.new TreeNode(7);
        // ==> 2
        System.out.println((new MinimumDepthOfBinaryTree()).minDepth(treeNode));
        // Binary Tree [1,2]
        TreeNode treeNode1 = minimumDepthOfBinaryTree.new TreeNode(1);
        treeNode1.left = minimumDepthOfBinaryTree.new TreeNode(2);
        // ==> 2
        System.out.println((new MinimumDepthOfBinaryTree()).minDepth(treeNode1));
    }
}
