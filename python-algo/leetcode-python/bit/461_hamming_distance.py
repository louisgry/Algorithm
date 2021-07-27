class Solution:
    def hammingDistance(self, x: int, y: int) -> int:
        xor = x ^ y
        return bin(xor).count('1')


if __name__ == '__main__':
    print(Solution().hammingDistance(1, 4))  # ==> 2
