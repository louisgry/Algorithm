from typing import List


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


if __name__ == '__main__':
    prices = [7,1,5,3,6,4]
    # ==> 5
    print(Solution().maxProfit(prices))
