package basic.algo.mind.cursor;

/**
 * @author Louis
 * @date Create in 2020/4/9 15:32
 */
public class LC_283_MoveZero {
    class Solution {
        public void moveZeroes(int[] nums) {
            // cursor：用k保存非零元素个数[0,k)
            int k=0;
            for(int i=0; i<nums.length; i++) {
                if(nums[i]==0) continue;
                nums[k++] = nums[i];
            }
            for(int i=k; i<nums.length; i++) {
                nums[i] = 0;
            }
        }
    }
}
