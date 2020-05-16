import collections


class Solution:
    def MoreThanHalfNum_Solution(self, numbers):
        # counter = collections.Counter(numbers).most_common()
        # # 返回出现次数大于数组长度一半的元素
        # if counter[0][1] > len(numbers) / 2:
        #     return counter[0][0]
        # return 0

        dict = {}
        for num in numbers:
            if num not in dict:
                dict[num] = 1
            else:
                dict[num] += 1
            # 返回出现次数大于数组长度一半的元素
            if dict[num] > len(numbers) / 2:
                return num
        return 0


if __name__ == '__main__':
    print(Solution().MoreThanHalfNum_Solution([1, 2, 3, 2, 2, 2, 5, 4, 2]))
