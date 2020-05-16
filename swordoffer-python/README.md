# 剑指Offer（Python）

## 题目
### 哈希
- [39-数组中出现次数超过一半的数字](https://www.nowcoder.com/practice/e8a1b01a2df14cb2b228b30ee6a92163)：[39题解](#39-数组中出现次数超过一半的数字)

## 题解
### 39-数组中出现次数超过一半的数字
- https://www.nowcoder.com/practice/e8a1b01a2df14cb2b228b30ee6a92163
- 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字
- 思路1：hash
- 复杂度：O(n)、O(n)
```python
class Solution:
    def MoreThanHalfNum_Solution(self, numbers):
        dict = {}
        for num in numbers:
            if num not in dict:
                dict[num] = 1
            else:
                dict[num] += 1
            # 返回出现次数大于数组长度一半的元素
            if dict[num] > len(numbers)/2:
                return num
        return 0
```
- 思路2：利用collections.Counter()
```python
import collections
class Solution:
    def MoreThanHalfNum_Solution(self, numbers):
        counter = collections.Counter(numbers).most_common()
        # 返回出现次数大于数组长度一半的元素
        if counter[0][1] > len(numbers) / 2:
            return counter[0][0]
        return 0
```
