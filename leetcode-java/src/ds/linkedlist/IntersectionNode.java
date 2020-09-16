package ds.linkedlist;

/**
 * @author Louis
 * @date Create in 2020/9/16 15:36
 */
public class IntersectionNode {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    /**
     * 160. 相交链表
     * - https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
     * - 编写程序，找到两个链表的相交节点
     * - 思路：两个节点同时开始，若pA到尾部移到pB链，若pB到尾部移到pA链，最终会同时走到相交节点处
     * - 复杂度：O(n)、O(1)
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // pA, pB同时开始
        ListNode pA = headA;
        ListNode pB = headB;
        while(pA != pB) {
            // 若pA到尾部移到pB链，若pB到尾部移到pA链
            if(pA == null) {
                pA = headB;
            }
            else {
                pA = pA.next;
            }
            if(pB == null) {
                pB = headA;
            }
            else {
                pB = pB.next;
            }
        }
        // 会同时走到相交节点处
        return pA;
    }

    /** main */
    public static void main(String[] args) {
        IntersectionNode obj = new IntersectionNode();
        // 4 -> 1 -> 8
        ListNode com = obj.new ListNode(8);
        ListNode pA = obj.new ListNode(4);
        pA.next = obj.new ListNode(1);
        pA.next = com;
        // 5 -> 0 -> 1 -> 8
        ListNode pB = obj.new ListNode(5);
        pB.next = obj.new ListNode(0);
        pB.next = obj.new ListNode(1);
        pB.next = com;
        // output: 8
        System.out.println(obj.getIntersectionNode(pA, pB).val);
    }
}
