# 剑指Offer（Python）

## 题目
### 哈希
- [39-数组中出现次数超过一半的数字](https://www.nowcoder.com/practice/e8a1b01a2df14cb2b228b30ee6a92163)：[39题解](#39-数组中出现次数超过一半的数字)

### 动态规划
- [10.1-斐波那契数列](https://www.nowcoder.com/practice/c6c7742f5ba7442aada113136ddea0c3)：[10.1题解](#10.1-斐波那契数列)
- [63-股票的最大利润](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock)：[63题解](#63-股票的最大利润)


## 题解
### 10.1-斐波那契数列
- https://www.nowcoder.com/practice/c6c7742f5ba7442aada113136ddea0c3
- 输出斐波那契数列的第n项（从0开始，第0项为0）
- 思路1：备忘录递归
- 复杂度：O(n)、O(n)
```python
class Solution:
    def Fibonacci(self, n: int) -> int:
        meomo = {0: 0, 1: 1}

        def helper(n):
            if n not in meomo:
                meomo[n] = helper(n - 1) + helper(n - 2)
            return meomo[n]

        return helper(n)
```
- 思路2：动态规划
- 复杂度：O(n)、O(n)
```python
class Solution:
    def Fibonacci(self, n: int) -> int:
        dp = {0: 0, 1: 1}
        for i in range(2, n + 1):
            dp[i] = dp[i - 1] + dp[i - 2]
        return dp[n]
```

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

### 63-股票的最大利润
- https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
- 可以有一次买入和一次卖出，买入必须在卖出前，求最大收益
- 思路：动态规划
    - 状态定义：dp[i]表示前i天的最大利润
    - 状态转移方程：dp[i] = max(dp[i-1], prices[i]-minprice)
- 复杂度：O(n)、O(n)
```python
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        # 边界条件
        n = len(prices)
        if n == 0:
            return 0

        # 状态定义：dp[i]表示前i天的最大利润
        dp = [0]*n

        # 状态转移方程：dp[i] = max(dp[i-1], prices[i]-minprice)
        minprice = prices[0]
        for i in range(1, n):
            minprice = min(minprice, prices[i])
            dp[i] = max(dp[i-1], prices[i]-minprice)
        return dp[n-1]
```
