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
        TreeLinkNode(int x) { val = x; }
    }

    /**
     * 8 二叉树的下一个节点
     * https://www.nowcoder.com/practice/9023a0c988684a53960365b889ceaf5e
     */
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        // 中序遍历：左节点 -> 根节点 -> 右节点
        // 如果存在右子树，下一个节点为右子树的最左节点
        // 如果不存在右子树，while循环
        // -- if该节点为父节点的左子树，下一节点是父节点(node.next)
        // -- 沿着父结点追朔，直到找到某个结点是其父结点的左子树
        if(pNode == null)
            return null;

        if(pNode.right != null) {
            TreeLinkNode node = pNode.right;
            while(node.left != null) {
                node = node.left;
            }
            return node;
        }

        while(pNode.next != null) {
            if(pNode == pNode.next.left) {
                return pNode.next;
            }
            pNode = pNode.next;
        }
        return null;
    }
}
