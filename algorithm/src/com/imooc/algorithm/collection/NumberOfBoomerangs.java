package com.imooc.algorithm.collection;

import java.util.HashMap;

/**
 * @Author: Louis
 * @Date: Create in 2019/10/14 15:17
 * @Description:
 */
public class NumberOfBoomerangs {
    /**
     * 447 Number of Boomerangs
     * https://leetcode.com/problems/number-of-boomerangs/
     * 思路：以i为枢纽点，把其他点跟i的距离放入Map，查找距离相同点的个数的组合
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(n)
     */
    public int numberOfBoomerangs(int[][] points) {
        int res = 0;
        // 遍历枢纽点i
        for(int i=0; i<points.length; i++) {
            // 把其他点的距离放入Map
            HashMap<Integer, Integer> record = new HashMap<Integer, Integer>();
            for(int j=0; j<points.length; j++) {
                if(j != i) {
                    // 对比距离时使用距离的平方，无浮点数误差问题
                    int dist = dis(points[i], points[j]);
                    if(!record.containsKey(dist))
                        record.put(dist, 1);
                    else
                        record.put(dist, record.get(dist)+1);
                }
            }
            // 计算相同距离点的个数的组合
            for(Integer dis : record.keySet())
                res += record.get(dis) * (record.get(dis)-1);
        }
        return res;
    }
    private int dis(int[] a, int[] b) {
        return (a[0]-b[0])*(a[0]-b[0]) + (a[1]-b[1])*(a[1]-b[1]);
    }
    /** main */
    public static void main(String[] args) {
        int[][] pointers = {{0,0},{1,0},{2,0}};
        // ==> 2
        System.out.println((new NumberOfBoomerangs()).numberOfBoomerangs(pointers));
    }
}
