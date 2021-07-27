package algo.search;

/**
 * @author Louis
 * @date Create in 2019/12/18 20:56
 */
public class FindMinimumNumInRotationArray {
    /**
     * 11.旋转数组的最小数字
     * https://www.nowcoder.com/practice/9f3231a991af4f55b95579b44b7a01ba
     * 复杂度：O(logn)、O(1)
     */
    public int minNumberInRotateArray(int[] array) {
        // 边界条件
        if (array.length == 1) {
            return array[0];
        }
        int l = 0, r = array.length - 1;
        // mid初始为0
        int mid = 0;
        while (l < r) {
            if (array[l] < array[r]) {
                return array[l];
            }
            mid = l + (r - l) / 2;
            // 1. 处于递增，改变l
            if (array[l] < array[mid]) {
                l = mid + 1;
            }
            // 2. 处于递减，改变r
            else if (array[mid] < array[r]) {
                r = mid;
            }
            // 3. 其余情况，l++缩小范围
            else {
                l++;
            }
        }
        return array[l];
    }

    public static void main(String[] args) {
        int[] array = {3, 4, 5, 1, 2};
        System.out.println((new FindMinimumNumInRotationArray()).minNumberInRotateArray(array));
        int[] array1 = {2, 3, 4, 5, 1};
        System.out.println((new FindMinimumNumInRotationArray()).minNumberInRotateArray(array1));
    }
}
