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
        ListNode p = pHead;
        ListNode q = pHead;
        // 判断是否有环
        do {
            p = p.next;
            q = q.next.next;
        } while(p != q);
        // 如果存在环，q从起点p从相遇点开始，则会在入口处相遇
        q = pHead;
        while(p != q) {
            p = p.next;
            q = q.next;
        }
        return p;
    }
}
