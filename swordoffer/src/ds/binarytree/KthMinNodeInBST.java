package ds.binarytree;

/**
 * @author Louis
 * @date Create in 2020/2/24 20:29
 */
public class KthMinNodeInBST {

    private class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        TreeNode(int x) { val = x; }
    }
    /**
     * 54-二叉查找树的第K个结点
     * - https://www.nowcoder.com/practice/ef068f602dde4d28aab2b210e859150a
     */
    /** 计数器，找第k个**/
    private int cnt = 0;
    private TreeNode res;
    TreeNode KthNode(TreeNode pRoot, int k) {
        inOrder(pRoot, k);
        return res;
    }
    private void inOrder(TreeNode root, int k) {
        if(root==null || cnt>=k) {
            return;
        }
        inOrder(root.left, k);
        cnt++;
        if(cnt == k) { res = root; }
        inOrder(root.right, k);
    }
}
