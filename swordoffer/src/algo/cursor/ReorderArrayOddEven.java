package algo.cursor;

/**
 * @author Louis
 * @date Create in 2019/12/29 22:41
 */
public class ReorderArrayOddEven {
    /**
     * 21-调整数组顺序使奇数位于偶数前面
     * - https://www.nowcoder.com/practice/beb5aa231adc45b2a5dcc5b62c93f593
     */
    public void reOrderArray(int [] array) {
        int k = 0;
        for(int i=0; i<array.length; i++) {
            if(Math.abs(array[i])%2 != 0) {
                int j = i;
                while(j > k) {
                    swap(array, j, j-1);
                    j--;
                }
                k++;
            }
        }
    }
    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        (new ReorderArrayOddEven()).reOrderArray(array);
        for(int i : array) {
            System.out.print(i);
        }
    }
}
