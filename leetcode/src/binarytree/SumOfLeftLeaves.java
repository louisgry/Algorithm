package binarytree;

/**
 * @author Louis
 * @date Create in 2019/10/1 16:25
 */
public class SumOfLeftLeaves {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /**
     * 404 Sum of Left Leaves
     * https://leetcode.com/problems/sum-of-left-leaves/
     * 思路：递归
     * 时间复杂度：O(n)
     * 空间复杂度：O(h)
     */
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        // 递归终止条件
        if (root == null) {
            return 0;
        }
        if (root.left!=null && root.left.left==null && root.left.right==null) {
            sum += root.left.val;
        }
        // 递归过程
        sum += sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        return sum;
    }
    /** main */
    public static void main(String[] args) {
        SumOfLeftLeaves sumOfLeftLeavesClass = new SumOfLeftLeaves();
        // binary tree [3,9,20,null,null,15,7]
        TreeNode treeNode = sumOfLeftLeavesClass.new TreeNode(3);
        treeNode.left = sumOfLeftLeavesClass.new TreeNode(9);
        treeNode.right = sumOfLeftLeavesClass.new TreeNode(20);
        treeNode.right.left = sumOfLeftLeavesClass.new TreeNode(15);
        treeNode.right.right = sumOfLeftLeavesClass.new TreeNode(7);
        // ==> 24
        System.out.println(sumOfLeftLeavesClass.sumOfLeftLeaves(treeNode));
    }

}
