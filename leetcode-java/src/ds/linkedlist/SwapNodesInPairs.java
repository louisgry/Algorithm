package ds.linkedlist;

/**
 * @author Louis
 * @date Create in 2019/10/20 16:32
 */
public class SwapNodesInPairs {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     * 24 Swap Nodes in Pairs
     * https://leetcode.com/problems/swap-nodes-in-pairs/
     * 思路：dummy head
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        ListNode p = dummyHead;
        // 注意：边界是p.next和p.next.next
        while (p.next != null && p.next.next != null) {
            ListNode node1 = p.next;
            ListNode node2 = node1.next;
            ListNode next = node2.next;

            node2.next = node1;
            node1.next = next;
            p.next = node2;
            p = node1;
        }
        return dummyHead.next;
    }

    /**
     * main
     */
    public static void main(String[] args) {
        SwapNodesInPairs swapNodesInPairs = new SwapNodesInPairs();
        // 1->2->3->4->null
        ListNode head = swapNodesInPairs.new ListNode(1);
        head.next = swapNodesInPairs.new ListNode(2);
        head.next.next = swapNodesInPairs.new ListNode(3);
        head.next.next.next = swapNodesInPairs.new ListNode(4);
        // ==> 2->1->4->3->null
        ListNode res = swapNodesInPairs.swapPairs(head);
        System.out.print(res.val + " ");
        System.out.print(res.next.val + " ");
        System.out.print(res.next.next.val + " ");
        System.out.print(res.next.next.next.val + " ");
    }
}
