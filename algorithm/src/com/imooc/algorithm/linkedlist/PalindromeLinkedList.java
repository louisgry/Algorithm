package com.imooc.algorithm.linkedlist;

/**
 * @Author: Louis
 * @Date: Create in 2019/10/23 11:47
 * @Description:
 */
public class PalindromeLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    /**
     * 234 Palindrome Linked List
     * https://leetcode.com/problems/palindrome-linked-list/
     * 思路：双指针
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public boolean isPalindrome(ListNode head) {
        ListNode p = head;
        ListNode q = head;
        while(q!=null && q.next!=null) {
            q = q.next.next;
            p = p.next;
        }
        if(q != null){
            p = p.next;
        }
        p = reverse(p);

        q = head;
        while(p != null) {
            if(p.val != q.val){
                return false;
            }
            p = p.next;
            q = q.next;
        }
        return true;
    }
    private ListNode reverse(ListNode node) {
        ListNode pre = null;
        ListNode cur = node;
        while(cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
    /** main */
    public static void main(String[] args) {
        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        // 1->2->2->1
        ListNode head = palindromeLinkedList.new ListNode(1);
        head.next = palindromeLinkedList.new ListNode(2);
        head.next.next = palindromeLinkedList.new ListNode(2);
        head.next.next.next = palindromeLinkedList.new ListNode(1);
        // ==> true
        System.out.println(palindromeLinkedList.isPalindrome(head));
    }
}
