package ds.binarytree;

/**
 * @author Louis
 * @date Create in 2019/10/10 16:08
 */
public class LowestCommonAncestorOfBST {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    /**
     * 235 Lowest Common Ancestor of a Binary Search Tree
     * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
     * 思路：递归
     * 时间复杂度：O(n)
     * 空间复杂度：O(h)
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // condition
        if(root == null) {
            return null;
        }
        // recursion
        if(p.val<root.val && q.val<root.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        if(p.val>root.val && q.val>root.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }
    /** main */
    public static void main(String[] args) {
        LowestCommonAncestorOfBST lowestCommonAncestorOfBST = new LowestCommonAncestorOfBST();
        // binary tree [6,2,8,0,4,7,9,null,null,3,5]
        TreeNode treeNode = lowestCommonAncestorOfBST.new TreeNode(6);
        treeNode.left = lowestCommonAncestorOfBST.new TreeNode(2);
        treeNode.right = lowestCommonAncestorOfBST.new TreeNode(8);
        treeNode.left.left = lowestCommonAncestorOfBST.new TreeNode(0);
        treeNode.left.right = lowestCommonAncestorOfBST.new TreeNode(4);
        treeNode.right.left = lowestCommonAncestorOfBST.new TreeNode(7);
        treeNode.right.right = lowestCommonAncestorOfBST.new TreeNode(9);
        treeNode.left.right.left = lowestCommonAncestorOfBST.new TreeNode(3);
        treeNode.left.right.right = lowestCommonAncestorOfBST.new TreeNode(5);
        // ==> 2
        TreeNode p = lowestCommonAncestorOfBST.new TreeNode(2);
        TreeNode q = lowestCommonAncestorOfBST.new TreeNode(4);
        System.out.println(lowestCommonAncestorOfBST.lowestCommonAncestor(treeNode, p, q).val);
    }
}
