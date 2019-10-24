package binarytree;

/**
 * @Author: Louis
 * @Date: Create in 2019/10/10 14:52
 * @Description:
 */
public class PathSumIII {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    /**
     * 437 Path Sum III
     * https://leetcode.com/problems/path-sum-iii/
     * 思路：递归嵌套递归
     * 时间复杂度：O(n)
     * 空间复杂度：O(h)
     */
    public int pathSum(TreeNode root, int sum) {
        // condition
        if(root == null) {
            return 0;
        }
        // recursion
        return findPath(root, sum)
                + pathSum(root.left, sum) + pathSum(root.right, sum);
    }
    private int findPath(TreeNode node, int sum) {
        // condition
        if(node == null) {
            return 0;
        }
        int res = 0;
        if(node.val == sum){
            res += 1;
        }
        // recursion
        res += findPath(node.left, sum-node.val);
        res += findPath(node.right, sum-node.val);

        return res;
    }
    /** main */
    public static void main(String[] args) {
        PathSumIII pathSumIII = new PathSumIII();
        // binary tree [10,5,-3,3,2,null,11,3,-2,null,1]
        TreeNode treeNode = pathSumIII.new TreeNode(10);
        treeNode.left = pathSumIII.new TreeNode(5);
        treeNode.right = pathSumIII.new TreeNode(-3);
        treeNode.left.left = pathSumIII.new TreeNode(3);
        treeNode.left.right = pathSumIII.new TreeNode(2);
        treeNode.right.right = pathSumIII.new TreeNode(11);
        treeNode.left.left.left = pathSumIII.new TreeNode(3);
        treeNode.left.left.right = pathSumIII.new TreeNode(-2);
        treeNode.left.right.right = pathSumIII.new TreeNode(1);
        // ==> 3
        int sum = 8;
        System.out.println(pathSumIII.pathSum(treeNode, sum));

    }
}
