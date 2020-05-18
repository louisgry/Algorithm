package ds.linkedlist;

/**
 * @author Louis
 * @date Create in 2019/10/22 10:59
 */
public class RemoveNthNodeFromEndOfList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     * 19 Remove Nth Node From End of List
     * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
     * 思路：双指针，p和q之间的长度是固定的，只遍历一遍
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        ListNode p = dummyHead;
        ListNode q = dummyHead;
        for (int i = 0; i < n + 1; i++) {
            assert q != null;
            q = q.next;
        }

        while (q != null) {
            p = p.next;
            q = q.next;
        }
        p.next = p.next.next;

        return dummyHead.next;

        /**
         * 基础解法：遍历两遍，第一遍求链表的size，第二遍使用dummyHead删除第size-n个元素
         * 时间复杂度：O(n)
         * 空间复杂度：O(1)
         */
//        ListNode dummyHead = new ListNode(0);
//        dummyHead.next = head;
//
//        ListNode cur = dummyHead.next;
//        int index = 0;
//        while(cur != null){
//            index ++;
//            cur = cur.next;
//        }
//        cur = dummyHead;
//        for(int i=0; i<index-n; i++){
//            cur = cur.next;
//        }
//        cur.next = cur.next.next;
//        return dummyHead.next;
    }

    /**
     * main
     */
    public static void main(String[] args) {
        RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();
        // 1->null, n=1（WA）
        ListNode head1 = removeNthNodeFromEndOfList.new ListNode(1);
        // ==> []
        ListNode res1 = removeNthNodeFromEndOfList.removeNthFromEnd(head1, 1);
        System.out.println(res1);

        // 1->2->3->4->5->null, n=2
        ListNode head = removeNthNodeFromEndOfList.new ListNode(1);
        head.next = removeNthNodeFromEndOfList.new ListNode(2);
        head.next.next = removeNthNodeFromEndOfList.new ListNode(3);
        head.next.next.next = removeNthNodeFromEndOfList.new ListNode(4);
        head.next.next.next.next = removeNthNodeFromEndOfList.new ListNode(5);
        // ==> 1->2->3->5
        ListNode res = removeNthNodeFromEndOfList.removeNthFromEnd(head, 2);
        System.out.print(res.val + " ");
        System.out.print(res.next.val + " ");
        System.out.print(res.next.next.val + " ");
        System.out.print(res.next.next.next.val + " ");
    }
}
