package ds.binarytree;

/**
 * @author Louis
 * @date Create in 2019/11/8 11:04
 */
public class FindNextNode {

    public class TreeLinkNode {
        int val;
        TreeLinkNode left;
        TreeLinkNode right;
        TreeLinkNode next;

        TreeLinkNode(int x) {
            val = x;
        }
    }

    /**
     * 8 二叉树的下一个节点
     * https://www.nowcoder.com/practice/9023a0c988684a53960365b889ceaf5e
     */
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        // 关键：next为指向父节点的指针
        if (pNode == null) {
            return null;
        }
        // 1. 有右子树：则下一个为右子树的最左孩子
        if (pNode.right != null) {
            TreeLinkNode pRight = pNode.right;
            while (pRight.left != null) {
                pRight = pRight.left;
            }
            return pRight;
        }
        // 2. 无右子树，且该节点为父节点的左子树：则下一个为该节点的父节点
        if (pNode.next != null && pNode.next.left == pNode) {
            return pNode.next;
        }
        // 3. 无右子树，且该节点为父节点的右子树：则下一个为该节点的最父节点
        if (pNode.next != null) {
            TreeLinkNode pNext = pNode.next;
            while (pNext.next != null && pNext.next.right == pNext) {
                pNext = pNext.next;
            }
            return pNext.next;
        }
        return null;
    }
}
