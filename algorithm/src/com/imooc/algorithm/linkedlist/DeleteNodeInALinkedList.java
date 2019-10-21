package com.imooc.algorithm.linkedlist;

/**
 * @Author: Louis
 * @Date: Create in 2019/10/21 16:29
 * @Description:
 */
public class DeleteNodeInALinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    /**
     * 237 Delete Node in a Linked List
     * https://leetcode.com/problems/delete-node-in-a-linked-list/
     * 思路：修改链表的值
     * 时间复杂度：O(1)
     * 空间复杂度：O(1)
     */
    public void deleteNode(ListNode node) {
        if(node == null) {
            return;
        }
        if(node.next == null){
            node = null;
            return;
        }
        node.val = node.next.val;
        node.next = node.next.next;
        return;
    }
    /** main */
    public static void main(String[] args) {
        DeleteNodeInALinkedList deleteNodeInALinkedList = new DeleteNodeInALinkedList();
        // 4->5->1->9->null
        ListNode node = deleteNodeInALinkedList.new ListNode(4);
        node.next = deleteNodeInALinkedList.new ListNode(5);
        node.next.next = deleteNodeInALinkedList.new ListNode(1);
        node.next.next.next = deleteNodeInALinkedList.new ListNode(9);
        // ==> 4->1->9->null
        deleteNodeInALinkedList.deleteNode(node.next);
        System.out.print(node.val + " ");
        System.out.print(node.next.val + " ");
        System.out.print(node.next.next.val + " ");
    }
}
