package algo.merge;

/**
 * @author Louis
 * @date Create in 2020/2/20 10:37
 */
public class ReversePair {
    /**
     * 51-数组中的逆序对
     * - https://www.nowcoder.com/practice/96bd6684e04a44eb80e6a68efc0ec6c5
     */
    private long cnt = 0;
    // 辅助数组
    private int[] tmp;
    public int InversePairs(int [] array) {
        // 二路归并
        tmp = new int[array.length];
        mergeSort(array, 0, array.length-1);
        // %运算必须加括号
        return (int) (cnt%1000000007);
    }
    private void mergeSort(int[] nums, int l, int r) {
        if(r-l < 1) {
            return;
        }
        int mid = l + (r-l)/2;
        mergeSort(nums, l, mid);
        mergeSort(nums, mid+1, r);
        merge(nums, l, mid, r);
    }
    private void merge(int[] nums, int l, int mid, int r) {
        int i=l, j=mid+1, k=l;
        while(i<=mid || j<=r) {
            if(i > mid) {
                tmp[k] = nums[j++];
            }
            else if(j > r) {
                tmp[k] = nums[i++];
            }
            else if(nums[i] <= nums[j]) {
                tmp[k] = nums[i++];
            }
            else {
                tmp[k] = nums[j++];
                // nums[i] > nums[j]，说明 nums[i...mid] 都大于 nums[j]
                this.cnt += mid-i+1;
            }
            k++;
        }
        for(k=l; k<=r; k++) {
            nums[k] = tmp[k];
        }
    }
}
