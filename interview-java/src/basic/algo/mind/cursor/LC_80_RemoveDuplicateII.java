package basic.algo.mind.cursor;

/**
 * @author Louis
 * @date Create in 2020/4/9 16:25
 */
public class LC_80_RemoveDuplicateII {
    public int removeDuplicates(int[] nums) {
        // cursor：用k保存不重复的元素
        int k = 0;
        for(int num : nums) {
            if(k<2 || nums[k-2]!=num) {
                nums[k++] = num;
            }
        }
        return k;
    }
    /** main */
    public static void main(String[] args) {
        System.out.println((new LC_80_RemoveDuplicateII()).removeDuplicates(new int[]{1,1,2,2,2,3,3}));
    }
}