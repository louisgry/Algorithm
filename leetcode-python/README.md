# LeetCode Top 100 (Python)
> https://github.com/louisgry/Algorithm/tree/master/leetcode-python

## 题目
### 二叉树
- [617-合并二叉树](https://leetcode-cn.com/problems/merge-two-binary-trees/)：[617题解](#617-合并二叉树)
### 位运算
- [461-汉明距离](https://leetcode-cn.com/problems/hamming-distance/)：[461题解](#461-汉明距离)

## 题解
### 617-合并二叉树
- https://leetcode-cn.com/problems/merge-two-binary-trees/
- 合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，否则不为 NULL 的节点将直接作为新二叉树的节点
- 思路：递归
- 复杂度：O(n)、O(h)
```python
class Solution:
    # 类型注解
    def mergeTrees(self, t1: TreeNode, t2: TreeNode) -> TreeNode:
        # condition：其中一个为空，就返回非空的那个
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