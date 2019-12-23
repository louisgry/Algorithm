package ds.linkedlist;


/**
 * @author Louis
 * @date Create in 2019/12/23 20:57
 */
public class RemoveNodeDuplicate {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    /**
     * 18.2-删除链表中重复的节点
     * https://www.nowcoder.com/practice/fc533c45b73a41b0b44ccba763f866ef
     */
    public ListNode deleteDuplication(ListNode pHead) {
        if(pHead==null || pHead.next==null) {
            return pHead;
        }
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = pHead;
        ListNode pre = dummyHead;
        ListNode cur = pre.next;
        while(cur != null) {
            if(cur.next!=null && cur.val == cur.next.val) {
                // 一直搜索到不同为止
                while(cur.next!=null && cur.val==cur.next.val) {
                    cur = cur.next;
                }
                pre.next = cur.next;
                cur = cur.next;
            }
            else {
                pre = pre.next;
                cur = cur.next;
            }
        }
        return dummyHead.next;
    }
}
