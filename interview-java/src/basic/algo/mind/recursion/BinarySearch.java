package basic.algo.mind.recursion;

/**
 * @author Louis
 * @date Create in 2020/4/9 14:49
 */
public class BinarySearch {

    /** 二分查找：迭代实现 */
    public static int binarySearch(int[] arr, int target) {
        // 要求：排序好的，Arrays.sort(arr)
        int l=0, r=arr.length-1;
        while (l<=r) {
            int mid = l+(r-l)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] < target) l = mid+1;
            else r = mid-1;
        }
        return -1;
    }

    /** 二分查找：递归实现 */
    public static int binarySearch(int[] arr, int l, int r, int target) {
        // 边界判断
        if(l > r) return -1;
        // 递归遍历
        int mid = l+(r-l)/2;
        if(arr[mid] == target) return mid;
        else if(arr[mid] < target) return binarySearch(arr, mid+1, r, target);
        else return binarySearch(arr, l, mid-1, target);
    }

    /** main */
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5};
        System.out.println(binarySearch(arr, 3));
        System.out.println(binarySearch(arr, 0, arr.length-1, 3));
    }
}
