package backtracking;

import java.util.*;
/**
 * @Author: Louis
 * @Date: Create in 2019/10/29 10:51
 * @Description:
 */
public class Combinations {
    /**
     * 77 Combinations
     * https://leetcode.com/problems/combinations/
     * 思路：回溯法
     * 时间复杂度：O(n^k)
     * 空间复杂度：O(k)
     */
    List<List<Integer>> res;
    public List<List<Integer>> combine(int n, int k) {
        res = new ArrayList<List<Integer>>();
        if(n<=0 || k<=0 || k>n) {
            return res;
        }
        generateCombinations(n, k, 1, new LinkedList<Integer>());
        return res;
    }
    private void generateCombinations(int n, int k, int start, LinkedList<Integer> c) {
        if(c.size() == k) {
            res.add((List<Integer>)c.clone());
            return;
        }
        for(int i=start; i<=n; i++) {
            c.addLast(i);
            generateCombinations(n, k, i+1, c);
            c.removeLast();
        }
        return;
    }
    /** main */
    public static void main(String[] args) {
        List<List<Integer>> res = (new Combinations()).combine(4, 2);
        // ==> [[2,4], [3,4], [2,3], [1,2], [1,3], [1,4]]
        for(List<Integer> list : res) {
            System.out.println(list.toString());
        }
    }
}
