package partition;

/**
 * @Author: Louis
 * @Date: Create in 2019/09/03 11:54
 * @Description:
 */
public class KthLargestElement {
    /**
     * 215. Kth Largest Element in an Array
     * https://leetcode.com/problems/kth-largest-element-in-an-array/
     * 思路：快排Partition
     * 时间复杂度：O(n)
     * 空间复杂度：O(logn)
     */
    public int findKthLargest(int[] nums, int k) {
        // 快排
        return findKthLargest(nums, 0, nums.length-1, k-1);
    }

    private int findKthLargest(int[] nums, int l, int r, int k){
        if(l==r)
            return nums[l];
        int p = partition(nums, l, r);

        if( p == k )
            return nums[p];
        else if( k < p )
            return findKthLargest(nums, l, p-1, k);
        else // k > p
            return findKthLargest(nums, p+1 , r, k);
    }

    private int partition(int[] nums, int l , int r){
        int p = (int) (Math.random()%(r-l+1) + l);
        swap(nums, l, p);
        int lt = l + 1;
        for( int i = l + 1 ; i <= r ; i ++ )
            if( nums[i] > nums[l] )
                swap(nums, i, lt++);

        swap(nums, l, lt-1);

        return lt-1;
    }

    private void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    /** main */
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        int result = (new KthLargestElement()).findKthLargest(nums, k);
        System.out.println(result);
    }
}
