package binarytree;

/**
 * @author Louis
 * @date Create in 2019/10/10 13:59
 */
public class SumRootToLeafNumbers {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    /**
     * 129 Sum Root to Leaf Numbers
     * https://leetcode.com/problems/sum-root-to-leaf-numbers/
     * 思路：递归
     * 时间复杂度：O(n)
     * 空间复杂度：O(h)
     */
    public int sumNumbers(TreeNode root) {
        return getSum(root, 0);
    }
    private int getSum(TreeNode root, int curSum) {
        // condition
        if(root == null) {
            return 0;
        }
        curSum = curSum*10 + root.val;
        if(root.left==null && root.right==null) {
            return curSum;
        }
        // recursion
        return getSum(root.left, curSum) + getSum(root.right, curSum);
    }
    /** main */
    public static void main(String[] args) {
        SumRootToLeafNumbers sumRootToLeafNumbers = new SumRootToLeafNumbers();
        // binary tree [1,2,3]
        TreeNode treeNode = sumRootToLeafNumbers.new TreeNode(1);
        treeNode.left = sumRootToLeafNumbers.new TreeNode(2);
        treeNode.right = sumRootToLeafNumbers.new TreeNode(3);
        // ==> 25
        System.out.println(sumRootToLeafNumbers.sumNumbers(treeNode));
    }
}
