package basic.algo.structure.tree;

import java.util.Arrays;

/**
 * @author Louis
 * @date Create in 2020/3/4 20:14
 */
public class RebuildBinaryTree {
    /** main */
    public static void main(String[] args) {
        RebuildBinaryTree tree = new RebuildBinaryTree();
        int[] pre = {3,9,20,15,7}, in = {9,3,15,20,7};
        tree.buildTree(pre, in);
    }
    /** 重建二叉树 */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // 非空判断
        if(preorder.length==0 || inorder.length==0) {
            return null;
        }
        // 前序遍历找根节点，第一个就是
        int val = preorder[0];
        TreeNode root = new TreeNode(val);
        int i = 0;
        // 中序遍历中找根节点，拆分左右子树
        while(inorder[i] != val) {
            i++;
        }
        // 递归遍历建立左右子树，copyOfRange左闭右开
        // inorder是0到i，preorder加1
        int n = preorder.length;
        root.left = buildTree(Arrays.copyOfRange(preorder, 1, i+1), Arrays.copyOfRange(inorder, 0, i));
        root.right = buildTree(Arrays.copyOfRange(preorder, i+1, n), Arrays.copyOfRange(inorder, i+1, n));
        return root;
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
