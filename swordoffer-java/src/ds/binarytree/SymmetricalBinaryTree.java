package ds.binarytree;

/**
 * @author Louis
 * @date Create in 2020/1/2 21:59
 */
public class SymmetricalBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /**
     * 28-对称的二叉树
     * - https://www.nowcoder.com/practice/ff05d44dfdb04e1d83bdbdab320efbcb
     */
    boolean isSymmetrical(TreeNode pRoot) {
        if(pRoot == null) {
            return true;
        }
        return isSymmetrical(pRoot.left, pRoot.right);
    }
    private boolean isSymmetrical(TreeNode p, TreeNode q) {
        if(p==null && q==null) {
            return true;
        }
        if(p==null || q==null) {
            return false;
        }
        if(p.val != q.val) {
            return false;
        }
        return isSymmetrical(p.left, q.right) &&
                isSymmetrical(p.right, q.left);
    }
}
