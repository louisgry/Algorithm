package basic.complexity;

import java.util.Arrays;

/**
 * @author Louis
 * @date Create in 2020/4/8 23:36
 */
public class DataSize {
    public static void main(String[] args) {
        int size = (int) Math.pow(10, 5);
        Integer[] arr = SortHelper.genRandomArray(size, 0, size);
        long starttime = System.currentTimeMillis();
        Arrays.sort(arr);
        long endtime = System.currentTimeMillis();
        System.out.println(endtime-starttime+"ms");
    }
}
