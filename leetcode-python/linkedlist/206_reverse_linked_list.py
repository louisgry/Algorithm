"""
206-反转链表
- https://leetcode-cn.com/problems/reverse-linked-list/
- 反转一个单链表
- 思路：递归
    - 终止条件：如为空，返回结点
    - 递归过程：先递归，再反转，返回node
- 复杂度：O(n)、O(n)
"""


class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        # condition：如为空，返回结点
        if head is None or head.next is None:
            return head
        # recursion：先递归，再反转，返回node
        node = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return node
