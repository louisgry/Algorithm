package ds.linkedlist;

/**
 * @author Louis
 * @date Create in 2019/12/30 12:04
 */
public class ReturnKthNodeFromEnd {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {val = x;}
    }
    /**
     * 22-链表中倒数第k个结点
     * - https://www.nowcoder.com/practice/529d3ae5a407492994ad2a246518148a
     */
    public ListNode FindKthToTail(ListNode head,int k) {
        // 边界条件判断
        if(head == null) {
            return null;
        }
        ListNode p = head;
        ListNode q = head;
        for(int i=0; i<k; i++) {
            // 如果k大于链表的长度
            if(q == null) {
                return null;
            }
            q = q.next;
        }
        while(q != null) {
            q = q.next;
            p = p.next;
        }
        return p;
    }
}
