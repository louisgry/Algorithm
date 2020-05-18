package ds.binarytree;

/**
 * @author Louis
 * @date Create in 2019/9/27 10:44
 */
public class SymmetricTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 101 Symmetric Tree
     * https://leetcode.com/problems/symmetric-tree/
     * 思路：递归
     * 时间复杂度：O(n)
     * 空间复杂度：O(h)
     */
    public boolean isSymmetric(TreeNode root) {
        // 递归终止条件
        if (root == null) {
            return true;
        }
        // 递归过程
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isMirror(p.left, q.right) && isMirror(p.right, q.left);
    }

    /**
     * main
     */
    public static void main(String[] args) {
        SymmetricTree symmetricTree = new SymmetricTree();
        // binary tree [1,2,2]
        TreeNode treeNode1 = symmetricTree.new TreeNode(1);
        treeNode1.left = symmetricTree.new TreeNode(2);
        treeNode1.right = symmetricTree.new TreeNode(2);
        // ==> true
        System.out.println(symmetricTree.isSymmetric(treeNode1));
        // binary tree [1,2,2,null,3,null,3]
        TreeNode treeNode2 = symmetricTree.new TreeNode(1);
        treeNode2.left = symmetricTree.new TreeNode(2);
        treeNode2.right = symmetricTree.new TreeNode(2);
        treeNode2.left.right = symmetricTree.new TreeNode(3);
        treeNode2.right.right = symmetricTree.new TreeNode(3);
        // ==> false
        System.out.println(symmetricTree.isSymmetric(treeNode2));

    }
}
