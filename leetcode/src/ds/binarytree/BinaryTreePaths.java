package ds.binarytree;

import java.util.List;
import java.util.ArrayList;
/**
 * @author Louis
 * @date Create in 2019/10/1 12:18
 */
public class BinaryTreePaths {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    /**
     * 257 Binary Tree Paths：https
     * //leetcode.com/problems/binary-tree-paths/
     * 思路：递归
     * 时间复杂度：
     * 空间复杂度：
     */
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<String>();
        // 递归终止条件
        if (root == null ) {
            return result;
        }
        if (root.left==null && root.right==null) {
            result.add(Integer.toString(root.val));
            return result;
        }
        // 递归过程
        List<String> leftPath = binaryTreePaths(root.left);
        for (String i : leftPath) {
            StringBuilder sb = new StringBuilder(Integer.toString(root.val));
            sb.append("->");
            sb.append(i);
            result.add(sb.toString());
        }
        List<String> rightPath = binaryTreePaths(root.right);
        for (String j : rightPath) {
            StringBuilder sb = new StringBuilder(Integer.toString(root.val));
            sb.append("->");
            sb.append(j);
            result.add(sb.toString());
        }
        return result;
    }
    /** main */
    public static void main(String[] args) {
        BinaryTreePaths binaryTreePaths = new BinaryTreePaths();
        // binary tree [1,2,3,null,5]
        TreeNode treeNode = binaryTreePaths.new TreeNode(1);
        treeNode.left = binaryTreePaths.new TreeNode(2);
        treeNode.right = binaryTreePaths.new TreeNode(3);
        treeNode.left.right = binaryTreePaths.new TreeNode(5);
        // ==> ["1->2->5", "1->3"]
        List<String> result = binaryTreePaths.binaryTreePaths(treeNode);
        System.out.println(result.toString());
    }
}
