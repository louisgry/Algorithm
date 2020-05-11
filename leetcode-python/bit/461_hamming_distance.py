"""
461-汉明距离
- https://leetcode-cn.com/problems/hamming-distance/
- 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目
- 思路：位不同，取异或，然后计算1的数目
- 复杂度：O(n)、O(1)
"""


class Solution:
    def hammingDistance(self, x: int, y: int) -> int:
        xor = x ^ y
        return bin(xor).count('1')


if __name__ == '__main__':
    print(Solution().hammingDistance(1, 4))  # ==> 2
