package cursor;

public class RemoveElement {
    /**
     * 27. Remove Element
     * https://leetcode.com/problems/remove-element/
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                if(i!=k){
                    int t = nums[i];
                    nums[i] = nums[k];
                    nums[k] = t;
                    k++;
                }
                else
                    k++;
            }
        }
        return k;
    }

    /** main */
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int newLength = (new RemoveElement()).removeElement(nums, val);
        for(int i=0; i<newLength; i++)
            System.out.print(nums[i]+" ");
    }



}
