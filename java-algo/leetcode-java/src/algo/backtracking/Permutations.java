package algo.backtracking;

import java.util.*;

/**
 * @author Louis
 * @date Create in 2019/10/28 19:24
 */
public class Permutations {
    /**
     * 46 Permutations
     * https://leetcode.com/problems/permutations/
     * 思路：回溯法，Perms(nums)={取出一个数字}+Perms(nums-这个数字)
     * 时间复杂度：O(n^n)
     * 空间复杂度：O(n)
     */
    private List<List<Integer>> res;
    private boolean[] used;

    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<List<Integer>>();
        if (nums.length == 0) {
            return res;
        }
        used = new boolean[nums.length];
        generatePerm(nums, 0, new LinkedList<Integer>());
        return res;
    }

    private void generatePerm(int[] nums, int index, LinkedList<Integer> p) {
        if (index == nums.length) {
            res.add((List<Integer>) p.clone());
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            // used[i]没有被使用
            if (!used[i]) {
                p.addLast(nums[i]);
                used[i] = true;
                generatePerm(nums, index + 1, p);
                p.removeLast();
                used[i] = false;
            }
        }
        return;
    }

    /**
     * main
     */
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        // ==> [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
        List<List<Integer>> res = (new Permutations()).permute(nums);
        for (List<Integer> list : res) {
            System.out.println(list.toString());
        }
    }
}
