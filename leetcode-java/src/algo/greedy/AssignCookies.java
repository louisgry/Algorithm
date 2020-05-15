package algo.greedy;

import java.util.*;
/**
 * @author Louis
 * @date Create in 2019/10/27 16:31
 */
public class AssignCookies {
    /**
     * 455 Assign Cookies
     * https://leetcode.com/problems/assign-cookies/
     * 思路：贪心，最大的饼干满足最贪的小朋友
     * 时间复杂度：O(nlogn)
     * 空间复杂度：O(1)
     */
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int gi = g.length-1, si = s.length-1;
        int res = 0;
        while(gi>=0 && si>=0) {
            if(s[si] >= g[gi]) {
                res++;
                si--;
                gi--;
            }
            else {
                gi--;
            }
        }
        return res;
    }
    /** main */
    public static void main(String[] args) {
        int[] g1 = {1,2,3};
        int[] s1 = {1,1};
        // ==> 1
        System.out.println((new AssignCookies()).findContentChildren(g1, s1));

        int[] g2 = {1,2};
        int[] s2 = {1,2,3};
        // ==> 2
        System.out.println((new AssignCookies()).findContentChildren(g2, s2));
    }
}
