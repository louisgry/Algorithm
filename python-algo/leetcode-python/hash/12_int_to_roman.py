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


if __name__ == '__main__':
    print(Solution().intToRoman(9))  # ==> IX
