package ds.linkedlist;

/**
 * @author Louis
 * @date Create in 2020/2/20 11:18
 */
public class CommonNodeOfTwoLinkedList {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     * 52-两个链表的第一个公共节点
     * - https://www.nowcoder.com/practice/6ab1d9a29e88450685099d45c9e31e46
     */
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        // p1到尾时从p2头开始，p2到尾时从p1头开始
        ListNode p1 = pHead1, p2 = pHead2;
        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
            if (p1 == null) {
                p1 = pHead2;
            }
            if (p2 == null) {
                p2 = pHead1;
            }
        }
        return p1;
    }
}
