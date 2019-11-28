package ds;

/**
 * @author Louis
 * @date Create in 2019/11/27 10:01
 */
public class BinaryTreeProblem {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /**
     * https://leetcode.com/problems/balanced-binary-tree/
     */
    public boolean isBalanced(TreeNode root) {
        // condition：条件设置有点难，平衡指左右子树高度差不超过1
        if(root==null) {
            return true;
        }
        if(Math.abs(getDepth(root.left)-getDepth(root.right))>1){
            return false;
        }
        // recursion
        return isBalanced(root.left) && isBalanced(root.right);
    }
    private int getDepth(TreeNode node) {
        if(node == null) {
            return 0;
        }
        return Math.max(getDepth(node.left), getDepth(node.right)) + 1;
    }
    /**
     * https://leetcode.com/problems/symmetric-tree/
     */
    public boolean isSymmetric(TreeNode root) {
        if(root==null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }
    // 改编isSame
    private boolean isMirror(TreeNode p, TreeNode q) {
        if(p==null && q==null) {
            return true;
        }
        if(p==null || q==null) {
            return false;
        }
        if(p.val != q.val) {
            return false;
        }
        return isMirror(p.left, q.right) && isMirror(p.right, q.left);
    }
    /**
     * https://leetcode.com/problems/invert-binary-tree/
     */
    public TreeNode invertTree(TreeNode root) {
        // condition
        if(root==null) {
            return null;
        }

        // recursion
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    /**
     * https://leetcode.com/problems/same-tree/
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 条件有点难设置：
        if(p==null && q==null) {
            return true;
        }
        if(p==null || q==null) {
            return false;
        }
        if(p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    /**
     * https://leetcode.com/problems/maximum-depth-of-binary-tree/
     */
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
    }



}
