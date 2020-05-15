package ds.linkedlist;

/**
 * @author Louis
 * @date Create in 2019/12/30 12:36
 */
public class ReverseLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {val = x;}
    }
    /**
     * 24-反转链表
     * - https://www.nowcoder.com/practice/75e878df47f24fdc9dc3e400ec6058ca
     */
    public ListNode ReverseList(ListNode head) {
        if(head == null || head.next==null) {
            return head;
        }
        ListNode node = ReverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }
}
