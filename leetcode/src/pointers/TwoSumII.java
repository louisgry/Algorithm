package pointers;

/**
 * @Author: Louis
 * @Date: Create in 2019/09/04 11:54
 * @Description:
 */
public class TwoSumII {
    /**
     * 167. Two Sum II
     * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
     * 思路：使用双指针，一个在前，一个在后，指针随sum与target的差距而变化
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public int[] twoSum(int[] numbers, int target) {
        int index1;
        int index2 = numbers.length-1;
        int[] result = {0, 0};
        for(index1=0; index1<numbers.length; ){
            if(numbers[index1]+numbers[index2]==target){
                result[0] = index1+1;
                result[1] = index2+1;
                break;
            }
            else if(numbers[index1]+numbers[index2]<target)
                index1++;
            else
                index2--;
        }
        return result;
    }

    private int binarySearch(int[] nums, int l, int r, int target){
        while(l<=r){
            int mid = l + (r-l)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[mid]<target)
                l = mid+1;
            else
                r = mid-1;
        }
        return -1;
    }

    /** main */
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] result = (new TwoSumII()).twoSum(numbers, target);
        System.out.println(result[0]+ " " +result[1]); // ==> [0, 1]
    }
}
