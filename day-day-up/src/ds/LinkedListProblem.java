package ds;

public class LinkedListProblem {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    /**
     * https://leetcode.com/problems/palindrome-linked-list/
     */

    /**
     * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode p = dummyHead;
        ListNode q = dummyHead;
        for(int i=0; i<n; i++) {
            q = q.next;
        }
        while(q.next != null) {
            p = p.next;
            q = q.next;
        }
        p.next = p.next.next;
        return dummyHead.next;
    }

    /**
     * https://leetcode.com/problems/delete-node-in-a-linked-list/
     */

    /**
     * https://leetcode.com/problems/swap-nodes-in-pairs/
     */
    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        ListNode pre = dummyHead;

        while(pre.next != null && pre.next.next != null) {
            ListNode node1 = pre.next;
            ListNode node2 = node1.next;
            ListNode next = node2.next;

            pre.next = node2;
            node2.next = node1;
            node1.next = next;

            pre = node1;
        }

        return dummyHead.next;
    }

    /**
     * https://leetcode.com/problems/remove-linked-list-elements/
     */


    /**
     * https://leetcode.com/problems/reverse-linked-list/
     */
    public ListNode reverseList(ListNode head) {
        /** 递归 */
//        // condition：下面没有return head，上面就需要；NPE加head.next==null判定条件
//        if(head==null || head.next==null) {
//            return head;
//        }
//        // recursion
//        ListNode node = reverseList(head.next);
//        head.next.next = head;
//        head.next = null;
//        return node;

        /** 迭代 */
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

}
