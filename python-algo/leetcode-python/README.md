# LeetCode (Python)
> https://github.com/louisgry/Algorithm/tree/master/leetcode-python

## 题目
### 二叉树
- [617-合并二叉树](https://leetcode-cn.com/problems/merge-two-binary-trees/)：[617题解](#617-合并二叉树)
- [226-翻转二叉树](https://leetcode-cn.com/problems/invert-binary-tree/)：[226题解](#226-翻转二叉树)
- [104-二叉树的最大深度](https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/）：[104题解](#104-二叉树的最大深度)

### 哈希
- [13-罗马数字转整数](https://leetcode-cn.com/problems/roman-to-integer/)：[13题解](#13-罗马数字转整数)

### 位运算
- [461-汉明距离](https://leetcode-cn.com/problems/hamming-distance/)：[461题解](#461-汉明距离)

### 数学
- [1360-日期之间隔几天](https://leetcode-cn.com/problems/number-of-days-between-two-dates/)：[1360题解](#1360-日期之间隔几天)

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

### 13-罗马数字转整数
- https://leetcode-cn.com/problems/roman-to-integer/
- 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。若左边比右边小，则相减，如IV=5-1=4
- 思路：直接累加，考虑左边比右边小的特殊情况
- 复杂度：O(n)、O(1)
```python
class Solution:
    def romanToInt(self, s: str) -> int:
        roman2int = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}
        res = 0
        # 单独处理最后一个
        for index in range(len(s)-1):
            # 考虑特殊情况：左边比右边小，则相减
            if roman2int[s[index]] < roman2int[s[index+1]]:
                res -= roman2int[s[index]]
            else:
                res += roman2int[s[index]]
        return res + roman2int[s[-1]]
```

### 12-整数转罗马数字
- https://leetcode-cn.com/problems/integer-to-roman/
- 给定一个整数，将其转为罗马数字。输入确保在 1 到 3999 的范围内
- 思路：贪心哈希表，count key的次数进行重复
- 复杂度：O(1)、O(1)
```python
class Solution:
    def intToRoman(self, num: int) -> str:
        int2roman = {1000: 'M', 900: 'CM', 500: 'D', 400: 'CD', 100: 'C', 90: 'XC', 50: 'L', 40: 'XL',
                     10: 'X', 9: 'IX', 5: 'V', 4: 'IV', 1: 'I'}
        res = ''
        for key in int2roman:
            if num // key != 0:
                # count有多少个key
                count = num // key
                # key对应的roman值重复count遍
                res += int2roman[key] * count
                # 求模，缩小
                num %= key
        return res
```

### 1360-日期之间隔几天
- https://leetcode-cn.com/problems/number-of-days-between-two-dates/
- 计算两个日期之间隔了多少天，日期以字符串形式给出，格式为 YYYY-MM-DD
- 思路：分别计算日期距离1971年1月1日有多少天，注意区分闰年的二月
- 复杂度：O(1)、O(1)
```python
class Solution:
    def daysBetweenDates(self, date1: str, date2: str) -> int:
        # 转化为距离1971年1月1日的天数
        date1 = [int(i) for i in date1.split('-')]
        date2 = [int(i) for i in date2.split('-')]
        # 传入可变参数*param，以元组形式传入date
        return abs(self.dateToInt(*date1) - self.dateToInt(*date2))

    def dateToInt(self, year, month, day):
        res = 0
        month_days = [31, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30]
        while year != 1971 or month != 1 or day != 1:
            res += 1
            day -= 1
            if day == 0:
                month -= 1
                day = month_days[month]
                # 闰年的二月：多一天
                if self.isLeapYear(year) and month == 2:
                    day += 1
            if month == 0:
                year -= 1
                month += 12
        return res

    def isLeapYear(self, year):
        # 闰年：能被4整除但不能被100整除/能被400整除
        return (year % 100 != 0 and year % 4 == 0) or year % 400 == 0
```

### 93-复原IP地址
- https://leetcode-cn.com/problems/restore-ip-addresses/
- 给定一个只包含数字的字符串，复原它并返回所有可能的 IP 地址格式
- 思路：https://leetcode-cn.com/problems/restore-ip-addresses/solution/97-100-jian-ji-hui-su-by-su-zi-2/
```python
from typing import List
class Solution:
    def restoreIpAddresses(self, s: str) -> List[str]:
        res = []

        # count记录split次数，s保留剩余的str
        def restore(count=0, ip='', s=''):
            if count == 4:
                if s == '':
                    res.append(ip[:-1])
                return
            if len(s) > 0:
                restore(count+1, ip+s[0]+'.', s[1:])
            if len(s) > 1 and s[0] != '0':
                restore(count+1, ip+s[:2]+'.', s[2:])
            if len(s) > 2 and s[0] != '0' and int(s[0:3]) < 256:
                restore(count+1, ip+s[:3]+'.', s[3:])
        restore(0, '', s)
        return res
```

### 102-二叉树的层序遍历
- https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
- 返回二叉树按层序遍历得到的节点值
- 思路：BFS，用队列
- 复杂度：O(n)、O(n)
```python
class Solution:
    def levelOrder(self, root: TreeNode) -> List[List[int]]:
        res = []
        queue = collections.deque()
        # 先将根节点入队
        queue.append(root)
        while queue:
            level = []
            for _ in range(len(queue)):
                # pop队首元素
                cur = queue.popleft()
                if cur is None:
                    continue
                level.append(cur.val)
                queue.append(cur.left)
                queue.append(cur.right)
            if level:
                res.append(level)
        return res
```