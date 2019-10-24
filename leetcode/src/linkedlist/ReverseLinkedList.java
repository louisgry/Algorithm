package linkedlist;

/**
 * @Author: Louis
 * @Date: Create in 2019/10/18 23:17
 * @Description:
 */
public class ReverseLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    /**
     * 206 Reverse Linked List
     * https://leetcode.com/problems/reverse-linked-list/
     * 思路1：递归
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public ListNode reverseList(ListNode head) {
        // condition
        if(head==null || head.next==null) {
            return head;
        }

        // recursion
        ListNode node = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return node;

        /**
         * 思路2：迭代
         * 时间复杂度：O(n)
         * 空间复杂度：O(1)
         */
//        ListNode pre = null;
//        ListNode cur = head;
//        while(cur != null) {
//            ListNode next = cur.next;
//
//            cur.next = pre;
//            pre = cur;
//            cur = next;
//        }
//        return pre;

    }
    /** main */
    public static void main(String[] args) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        // Input: 1->2->3->4->5->NULL
        ListNode head = reverseLinkedList.new ListNode(1);
        head.next = reverseLinkedList.new ListNode(2);
        head.next.next = reverseLinkedList.new ListNode(3);
        head.next.next.next = reverseLinkedList.new ListNode(4);
        head.next.next.next.next = reverseLinkedList.new ListNode(5);
        // ==> 5->4->3->2->1->NULL
        ListNode res = reverseLinkedList.reverseList(head);
        System.out.print(res.val + " ");
        System.out.print(res.next.val + " ");
        System.out.print(res.next.next.val + " ");
        System.out.print(res.next.next.next.val + " ");
        System.out.print(res.next.next.next.next.val + " ");
    }
}
