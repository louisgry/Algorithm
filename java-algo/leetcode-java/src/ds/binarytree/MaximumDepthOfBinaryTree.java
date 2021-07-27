package ds.binarytree;

/**
 * @author Louis
 * @date Create in 2019/9/23 22:48
 */
public class MaximumDepthOfBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 104 Maximum Depth of Binary Tree
     * https://leetcode.com/problems/maximum-depth-of-binary-tree/
     * 思路：递归
     * 时间复杂度：O(n)，n是节点数
     * 空间复杂度：O(h)，h是树深度
     */
    public int maxDepth(TreeNode root) {
        // 递归终止条件
        if (root == null) {
            return 0;
        }
        // 递归过程
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    /**
     * main
     */
    public static void main(String[] args) {
        MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();
        // 成员内部类：Binary Tree [3,9,20,null,null,15,7]
        TreeNode treeNode = maximumDepthOfBinaryTree.new TreeNode(3);
        treeNode.left = maximumDepthOfBinaryTree.new TreeNode(9);
        treeNode.right = maximumDepthOfBinaryTree.new TreeNode(20);
        treeNode.right.left = maximumDepthOfBinaryTree.new TreeNode(15);
        treeNode.right.right = maximumDepthOfBinaryTree.new TreeNode(7);
        // ==> 3
        System.out.println(maximumDepthOfBinaryTree.maxDepth(treeNode));
    }
}
