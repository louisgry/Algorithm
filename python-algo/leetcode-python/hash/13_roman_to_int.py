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


if __name__ == '__main__':
    s = "LVIII"
    print(Solution().romanToInt(s))  # ==> 58
