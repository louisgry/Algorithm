# LeetCode Top 100 (Python)
> https://github.com/louisgry/Algorithm/tree/master/leetcode-python

## 题目
### 二叉树
- [617-合并二叉树](https://leetcode-cn.com/problems/merge-two-binary-trees/)：[617题解](#617-合并二叉树)
- [226-翻转二叉树](https://leetcode-cn.com/problems/invert-binary-tree/)：[226题解](#226-翻转二叉树)
- [104-二叉树的最大深度](https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/）：[104题解](#104-二叉树的最大深度)

### 位运算
- [461-汉明距离](https://leetcode-cn.com/problems/hamming-distance/)：[461题解](#461-汉明距离)

## 题解
### 617-合并二叉树
- https://leetcode-cn.com/problems/merge-two-binary-trees/
- 合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，否则不为 NULL 的节点将直接作为新二叉树的节点
- 思路：递归
    - 终止条件：如果为空，返回非空节点
    - 递归过程：先节点值相加，再递归
- 复杂度：O(n)、O(h)
```python
class Solution:
    # 类型注解
    def mergeTrees(self, t1: TreeNode, t2: TreeNode) -> TreeNode:
        # condition：其中一个为空，就返回非空的节点
        if t1 is None:
            return t2
        if t2 is None:
            return t1
        
        # recursion：节点值相加
        root = TreeNode(t1.val + t2.val)
        root.left = self.mergeTrees(t1.left, t2.left)
        root.right = self.mergeTrees(t1.right, t2.right)
        return root
```

### 461-汉明距离
- https://leetcode-cn.com/problems/hamming-distance/
- 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目
- 思路：位不同，取异或，然后计算1的数目
- 复杂度：O(n)、O(1)
```python
class Solution:
    def hammingDistance(self, x: int, y: int) -> int:
        xor = x ^ y
        return bin(xor).count('1')
```

### 226-翻转二叉树
- https://leetcode-cn.com/problems/invert-binary-tree/
- 左右子树互换
- 思路：递归
    - 终止条件：如为空，返回空
    - 递归过程：先swap，再递归
- 复杂度：O(n)、O(h)
```python
class Solution:
    def invertTree(self, root: TreeNode) -> TreeNode:
        # condition：如为空，返回空
        if root is None:
            return None
        # recursion：先swap，再递归
        root.left, root.right = root.right, root.left
        self.invertTree(root.left)
        self.invertTree(root.right)
        return root
```

### 104-二叉树的最大深度
- https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
- 给定一个二叉树，找出其最大深度
- 思路：递归
    - 终止条件：如为空，则深度为0
    - 递归过程：返回左右子树中的最大深度+1
- 复杂度：O(n)、O(h)
```python
class Solution:
    def maxDepth(self, root: TreeNode) -> int:
        # condition：如为空，则深度为0
        if root is None:
            return 0
        # recursion：返回左右子树中的最大深度+1
        return max(self.maxDepth(root.left), self.maxDepth(root.right)) + 1
```

### 206-反转链表
- https://leetcode-cn.com/problems/reverse-linked-list/
- 反转一个单链表
- 思路：递归
    - 终止条件：如为空，返回结点
    - 递归过程：先递归，再反转，返回node
- 复杂度：O(n)、O(n)
```python
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
```