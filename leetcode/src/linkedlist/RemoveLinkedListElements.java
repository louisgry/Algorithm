package linkedlist;

/**
 * @Author: Louis
 * @Date: Create in 2019/10/19 11:37
 * @Description:
 */
public class RemoveLinkedListElements {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    /**
     * 203 Remove Linked List Elements
     * https://leetcode.com/problems/remove-linked-list-elements/
     * 思路：dummy head
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode cur = dummyHead;
        while(cur.next != null) {
            if(cur.next.val == val) {
                cur.next = cur.next.next;
            }
            else {
                cur = cur.next;
            }
        }
        return dummyHead.next;
    }
    /** main */
    public static void main(String[] args) {
        RemoveLinkedListElements removeLinkedListElements = new RemoveLinkedListElements();
        // 1->2->3->4->null
        ListNode head = removeLinkedListElements.new ListNode(1);
        head.next = removeLinkedListElements.new ListNode(2);
        head.next.next = removeLinkedListElements.new ListNode(3);
        head.next.next.next = removeLinkedListElements.new ListNode(4);
        // ==> 2->3->4->null
        ListNode res = removeLinkedListElements.removeElements(head, 1);
        System.out.print(res.val + " ");
        System.out.print(res.next.val + " ");
        System.out.print(res.next.next.val + " ");
    }
}
