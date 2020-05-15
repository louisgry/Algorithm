package ds.linkedlist;

/**
 * @author Louis
 * @date Create in 2019/12/30 12:29
 */
public class LoopInLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {val = x;}
    }
    /**
     * 23-链表中环的入口结点
     * - https://www.nowcoder.com/practice/253d2c59ec3e4bc68da16833f79a38e4
     */
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        // 边界条件判断
        if(pHead==null || pHead.next==null) {
            return null;
        }
        // 快慢指针
        ListNode fast = pHead;
        ListNode slow = pHead;
        do {
            fast = fast.next.next;
            slow = slow.next;
        } while(fast != slow);
        // 如果存在环，fast从起点slow从相遇点开始，则会在入口处相遇
        fast = pHead;
        while(fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
