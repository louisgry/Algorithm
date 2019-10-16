package com.imooc.algorithm.collection;

import java.util.HashSet;

/**
 * @Author: Louis
 * @Date: Create in 2019/10/11 22:44
 * @Description:
 */
public class HappyNumber {
    /**
     * 202 Happy Number
     * https://leetcode.com/problems/happy-number/
     * 思路：Hash Set
     * 时间复杂度：O(?)
     * 空间复杂度：O(?)
     */
    public boolean isHappy(int n) {
        if(n<1) {
            return false;
        }
        HashSet<Integer> set = new HashSet<Integer>();
        int t;
        int newN;
        while(n!=1 && !set.contains(n)) {
            set.add(n);
            newN = 0;
            while(n>0) {
                t = n%10;
                n /= 10;
                newN += t*t;
            }
            n = newN;
        }
        return n == 1;
    }
    /** main */
    public static void main(String[] args) {
        int num = 19;
        // ==> true
        System.out.println((new HappyNumber()).isHappy(num));
    }
}
