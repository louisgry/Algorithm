package collection;

import java.util.TreeSet;

/**
 * @author Louis
 * @date Create in 2019/10/16 20:27
 */
public class ContainsDuplicateIII {
    /**
     * 220 Contain Duplicate III
     * https://leetcode.com/problems/contains-duplicate-iii/
     * 思路：set+滑动窗口
     * 时间复杂度：O(nlogk)
     * 空间复杂度：O(k)
     */
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        // 需要用Long和long，会发生整型溢出
        TreeSet<Long> set = new TreeSet<Long>();
        for(int i=0; i<nums.length; i++) {
            if(set.ceiling((long)nums[i]-(long)t) != null && set.ceiling((long)nums[i]-(long)t)<=(long)nums[i]+(long)t){
                return true;
            }
            set.add((long)nums[i]);
            if(set.size() == k+1){
                set.remove((long)nums[i-k]);
            }
        }
        return false;
    }
    /** main */
    public static void main(String[] args) {
        int[] nums = {-2147483648, -2147483647};
        int k = 3;
        int t = 3;
        // ==> true
        System.out.println((new ContainsDuplicateIII()).containsNearbyAlmostDuplicate(nums, k, t));
    }
}
