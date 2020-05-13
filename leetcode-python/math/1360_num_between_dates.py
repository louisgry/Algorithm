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


if __name__ == '__main__':
    date1 = "2020-01-15"
    date2 = "2019-12-31"
    print(Solution().daysBetweenDates(date1, date2))  # ==> 15

