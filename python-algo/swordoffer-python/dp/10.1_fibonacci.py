class Solution:

    # 备忘录递归
    def Fibonacci(self, n: int) -> int:
        meomo = {0: 0, 1: 1}

        def helper(n):
            if n not in meomo:
                meomo[n] = helper(n - 1) + helper(n - 2)
            return meomo[n]

        return helper(n)

    # 动态规划
    def Fibonacci(self, n):
        dp = {0: 0, 1: 1}
        for i in range(2, n + 1):
            dp[i] = dp[i - 1] + dp[i - 2]
        return dp[n]


if __name__ == '__main__':
    # 0, 1, 1, 2, 3, 5, 8, 13
    for i in range(10):
        print(Solution().Fibonacci(i), end=' ')
