package ds.array;

/**
 * @author Louis
 * @date Create in 2019/10/24 20:16
 */
public class SearchInTwoDimArray {
    /**
     * 4 二维数组中的查找
     * https://www.nowcoder.com/practice/abc3fe2ce8e146608e868a70efebf62e
     * 思路：双指针
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public boolean Find(int target, int [][] array) {
        int i = 0;
        int j = array[0].length - 1;
        while(i<array.length && j>=0) {
            if(array[i][j] == target) {
                return true;
            }
            else if(array[i][j] > target) {
                j--;
            }
            else {
                i++;
            }
        }
        return false;
    }
    /** main */
    public static void main(String[] args) {
        int[][] array = {{1,2,8},{2,4,9},{4,7,10}};
        // ==> true
        System.out.println((new SearchInTwoDimArray()).Find(7, array));
        // ==> false
        System.out.println((new SearchInTwoDimArray()).Find(5, array));
    }
}
