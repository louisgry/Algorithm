package basic.ds;

/**
 * @author Louis
 * @date Create in 2020/3/2 22:45
 */
public class LinkedListGoingDeeper {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
    }

    /** 合并两个有序链表 */
    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // condition
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }
        // recursion
        if(l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
