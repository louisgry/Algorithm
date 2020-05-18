package basic.algo.mind.cursor;

/**
 * @author Louis
 * @date Create in 2020/4/9 15:58
 */
public class LC_26_RemoveDuplicate {
    public int removeDuplicates(int[] nums) {
        // cursor：用k保存不重复的元素
        int k = 1, count = 1;
        for(int i=1; i<nums.length; i++) {
            if(nums[i] != nums[i-1]) {
                count++;
            }
            else {
                count = 1;
            }
            if(count==2) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}
