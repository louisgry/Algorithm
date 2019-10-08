package ds.binarytree;

import java.util.List;
import java.util.ArrayList;

/**
 * @author Louis
 * @date Create in 2019/10/10 13:18
 */
public class PathSumII {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    /**
     * 113 Path Sum II
     * https://leetcode.com/problems/path-sum-ii/
     * 思路：递归
     * 时间复杂度：O(n)
     * 空间复杂度：O(h)
     */
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> middle = new ArrayList<>();
        getPathSum(root, sum, middle, result);
        return result;
    }
    private void getPathSum(TreeNode root, int sum, ArrayList<Integer> middle, List<List<Integer>> result) {
        // condition
        if(root == null) {
            return;
        }
        middle.add(root.val);
        if(root.left==null && root.right==null) {
            if(root.val == sum) {
                result.add(new ArrayList<>(middle));
            }
        }
        // recursion
        getPathSum(root.left, sum-root.val, middle, result);
        getPathSum(root.right, sum-root.val, middle, result);
        middle.remove(middle.size()-1);
    }
    /** main */
    public static void main(String[] args) {
        PathSumII pathSumII = new PathSumII();
        // binary tree [5,4,8,11,null,13,4,7,2,null,null,5,1]
        TreeNode treeNode = pathSumII.new TreeNode(5);
        treeNode.left = pathSumII.new TreeNode(4);
        treeNode.right = pathSumII.new TreeNode(8);
        treeNode.left.left = pathSumII.new TreeNode(11);
        treeNode.right.left = pathSumII.new TreeNode(13);
        treeNode.right.right = pathSumII.new TreeNode(4);
        treeNode.left.left.left = pathSumII.new TreeNode(7);
        treeNode.left.left.right = pathSumII.new TreeNode(2);
        treeNode.right.right.left = pathSumII.new TreeNode(5);
        treeNode.right.right.right = pathSumII.new TreeNode(1);
        // ==> [[5,4,11,2],[5,8,4,5]]
        int sum = 22;
        List<List<Integer>> result = pathSumII.pathSum(treeNode, sum);
        for(List item : result) {
            System.out.println(item.toString());
        }
    }
}
