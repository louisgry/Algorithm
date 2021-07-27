package ds.collection;

import java.util.HashSet;

/**
 * @author Louis
 * @date Create in 2019/10/16 17:49
 */
public class ContainsDuplicateII {
    /**
     * 219 Contains Duplicate II
     * https://leetcode.com/problems/contains-duplicate-ii/
     * 思路：Set+滑动窗口
     * 时间复杂度：O(n)
     * 空间复杂度：O(k)
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);

            // 保持set中最多有k个元素（边界：i-k）
            if (set.size() == k + 1) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }

    /**
     * main
     */
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        // ==> true
        System.out.println((new ContainsDuplicateII()).containsNearbyDuplicate(nums, k));

        int[] nums2 = {1, 2, 3, 1, 2, 3};
        int k2 = 2;
        // ==> false
        System.out.println((new ContainsDuplicateII()).containsNearbyDuplicate(nums2, k2));
    }
}
