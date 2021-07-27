package ds.binarytree;

/**
 * @author Louis
 * @date Create in 2020/1/13 16:50
 */
public class ConvertBinaryTreeToLinkedList {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 36-二叉搜索树与双向链表
     * - https://www.nowcoder.com/practice/947f6eb80d944a84850b0538bf0ec3a5
     */
    // 双向链表左边头结点、右边头结点
    private TreeNode lHead = null;
    private TreeNode rHead = null;

    public TreeNode Convert(TreeNode pRootOfTree) {
        // 中序遍历
        if (pRootOfTree == null) {
            return null;
        }
        // 最左的叶子节点作为链表第一个结点
        Convert(pRootOfTree.left);
        if (rHead == null) {
            lHead = pRootOfTree;
            rHead = pRootOfTree;
        } else {
            // 根节点插入链表右边，rHead向后移
            rHead.right = pRootOfTree;
            pRootOfTree.left = rHead;
            rHead = pRootOfTree;
        }
        // 插入右叶子节点
        Convert(pRootOfTree.right);
        // 返回左边头结点
        return lHead;
    }
}
