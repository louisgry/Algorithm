package binarytree;

/**
 * @author Louis
 * @date Create in 2019/9/26 23:56
 */
public class SameTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    /**
     * 100 Same Tree
     * https://leetcode.com/problems/same-tree/
     * 思路：递归
     * 时间复杂度：O(n)
     * 空间复杂度：O(h)
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 递归终止条件
        if (p==null && q==null) {
            return true;
        }
        if (p==null || q==null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        // 递归过程
        boolean left = isSameTree(p.left, q.left);
        boolean right = isSameTree(p.right, q.right);
        return left && right;
    }
    /** main */
    public static void main(String[] args) {
        SameTree sameTree = new SameTree();
        // binary tree [1,2,3] & [1,2,3]
        TreeNode treeNode1 = sameTree.new TreeNode(1);
        treeNode1.left = sameTree.new TreeNode(2);
        treeNode1.right = sameTree.new TreeNode(3);
        TreeNode treeNode2 = sameTree.new TreeNode(1);
        treeNode2.left = sameTree.new TreeNode(2);
        treeNode2.right = sameTree.new TreeNode(3);
        // ==> true
        System.out.println(sameTree.isSameTree(treeNode1, treeNode2));
        // binary tree [1,2,null] & [1,null,2]
        TreeNode treeNode3 = sameTree.new TreeNode(1);
        treeNode3.left = sameTree.new TreeNode(2);
        TreeNode treeNode4 = sameTree.new TreeNode(1);
        treeNode4.right = sameTree.new TreeNode(2);
        // ==> false
        System.out.println(sameTree.isSameTree(treeNode3, treeNode4));
    }
}
