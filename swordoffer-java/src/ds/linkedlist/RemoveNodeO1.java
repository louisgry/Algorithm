package ds.linkedlist;

/**
 * @author Louis
 * @date Create in 2019/12/23 20:47
 */
public class RemoveNodeO1 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    /**
     * 18.1-在O(1)时间内删除链表节点
     */
    public void deleteNode(ListNode node) {
        if(node == null) {
            return;
        }
        if(node.next == null) {
            node = null;
            return;
        }
        node.val = node.next.val;
        node.next = node.next.next;
        return;
    }
}
