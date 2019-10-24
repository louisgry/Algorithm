package binarytree;

/**
 * @Author: Louis
 * @Date: Create in 2019/9/28 10:26
 * @Description:
 */
public class CountCompleteTreeNodes {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    /**
     * 222 Count Complete Tree Nodes
     * https://leetcode.com/problems/count-complete-tree-nodes/
     * 思路：递归
     * 时间复杂度：O(n)
     * 空间复杂度：O(h)
     */
    public int countNodes(TreeNode root) {
        // 递归终止条件
        if (root==null) {
            return 0;
        }

        // 递归过程
        return 1+countNodes(root.left)+countNodes(root.right);
    }
    /** main */
    public static void main(String[] args){
        CountCompleteTreeNodes countCompleteTreeNodes = new CountCompleteTreeNodes();
        // binary tree [1,2,3,4,5,6,null]
        TreeNode treeNode = countCompleteTreeNodes.new TreeNode(1);
        treeNode.left = countCompleteTreeNodes.new TreeNode(2);
        treeNode.right = countCompleteTreeNodes.new TreeNode(3);
        treeNode.left.left = countCompleteTreeNodes.new TreeNode(4);
        treeNode.left.right = countCompleteTreeNodes.new TreeNode(5);
        treeNode.right.left = countCompleteTreeNodes.new TreeNode(6);
        // ==> 6
        System.out.println(countCompleteTreeNodes.countNodes(treeNode));
    }
}
