package basic.algo.mind.cursor;

/**
 * @author Louis
 * @date Create in 2020/4/9 15:51
 */
public class LC_27_RemoveElement {
    public int removeElement(int[] nums, int val) {
        // cursor：用k保存非val值的元素[0,k)
        int k=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]==val) continue;
            nums[k++] = nums[i];
        }
        return k;
    }
}
