package greedy;

import java.util.*;
/**
 * @Author: Louis
 * @Date: Create in 2019/10/28 11:44
 * @Description:
 */
public class NonOverlappingIntervals {
    /**
     * 435 Non-overlapping Intervals
     * https://leetcode.com/problems/non-overlapping-intervals/
     */
    public int eraseOverlapIntervals(int[][] intervals) {
        /**
         * 思路1：贪心，选择区间结尾最早的且和前面不重叠
         * 时间复杂度：O(n)
         * 空间复杂度：O(n)
         */
        if(intervals.length == 0) {
            return 0;
        }
        // 结尾早的靠前
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] != o2[1]) {
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            }
        });

        int count = 1;
        int pre = 0;
        for(int i=1; i<intervals.length; i++) {
            if(intervals[i][0] >= intervals[pre][1]) {
                count++;
                pre = i;
            }
        }
        return intervals.length - count;

        /**
         * 思路2：动态规划
         * 时间复杂度：O(n)
         * 空间复杂度：O(n)
         */
//        if(intervals.length == 0) {
//            return 0;
//        }
//
//        Arrays.sort(intervals, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                if (o1[0] != o2[0]) {
//                    return o1[0] - o2[0];
//                }
//                return o1[1] - o2[1];
//            }
//        });
//
//        // memo[i] 表示使用 intervals[0...i] 的区间能构成的最长不重叠区间序列的长度；
//        int[] memo = new int[intervals.length];
//        Arrays.fill(memo, 1);
//
//        for (int i = 1; i < intervals.length; i++) {
//            for (int j = 0; j < i; j++) {
//                if (intervals[i][0] >= intervals[j][1]) {
//                    memo[i] = Math.max(memo[i], 1 + memo[j]);
//                }
//            }
//        }
//
//        int count = 0;
//        for(int i = 0; i < memo.length; i++) {
//            count = Math.max(count, memo[i]);
//        }
//
//        return intervals.length - count;
    }
    /** main */
    public static void main(String[] args) {
        int[][] intervals1 = {{1,2},{2,3},{3,4},{1,3}};
        // ==> 1
        System.out.println((new NonOverlappingIntervals()).eraseOverlapIntervals(intervals1));
    }
}
