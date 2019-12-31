package ds.linkedlist;

/**
 * @author Louis
 * @date Create in 2019/12/30 21:43
 */
public class MergeTwoLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {val = x;}
    }
    /**
     * 25-合并两个排序的链表
     * - https://www.nowcoder.com/practice/d8b6b4358f774294a89de2a6ac4d9337
     */
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null) {
            return list2;
        }
        if(list2 == null) {
            return list1;
        }
        if(list1.val <= list2.val) {
            list1.next = Merge(list1.next, list2);
            return list1;
        }
        else {
            list2.next = Merge(list1, list2.next);
            return list2;
        }
    }
}
