package comm;

import java.util.List;

/**
 * @author Louis
 * @date Create in 2020/10/21 14:41
 */
public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    /**
     * 创建二叉树
     * @param array 二叉树数组
     * @param index 起始下标
     * @return TreeNode
     */
    public static TreeNode createTree(int[] array, int index) {
        TreeNode root = null;
        if(index < array.length) {
            root = new TreeNode(array[index]);
            root.left = createTree(array, 2*index+1);
            root.right = createTree(array, 2*index+2);
        }
        return root;
    }
}
