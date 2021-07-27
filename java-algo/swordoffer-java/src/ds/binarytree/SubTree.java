package ds.binarytree;

/**
 * @author Louis
 * @date Create in 2019/12/31 20:06
 */
public class SubTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 26-树的子结构
     * - https://www.nowcoder.com/practice/6e196c44c7004d15b1610b9afca8bd88
     */
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        return isSubtree(root1, root2) ||
                HasSubtree(root1.left, root2) ||
                HasSubtree(root1.right, root2);
    }

    private boolean isSubtree(TreeNode root1, TreeNode root2) {
        // 顺序不能变
        if (root2 == null) {
            return true;
        }
        if (root1 == null) {
            return false;
        }
        if (root1.val != root2.val) {
            return false;
        }
        return isSubtree(root1.left, root2.left) &&
                isSubtree(root1.right, root2.right);
    }
}
