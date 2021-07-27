package ds.binarytree;

/**
 * @author Louis
 * @date Create in 2020/1/2 21:51
 */
public class MirrorBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 27-二叉树的镜像
     * - https://www.nowcoder.com/practice/564f4c26aa584921bc75623e48ca3011
     */
    public void Mirror(TreeNode root) {
        if (root == null) {
            return;
        }
        swap(root);
        Mirror(root.left);
        Mirror(root.right);
    }

    private void swap(TreeNode root) {
        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;
    }
}
