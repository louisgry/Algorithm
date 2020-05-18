package basic.complexity;

/**
 * @author Louis
 * @date Create in 2020/4/8 23:38
 */
public class SortHelper {
    /**
     * 不产生任何的实例
     */
    private SortHelper() {}

    /**
     * 生成n个元素的随机数组
     * @param n 大小
     * @param rangeL 左边界
     * @param rangeR 右边界
     * @return Integer[]
     */
    public static Integer[] genRandomArray(int n, int rangeL, int rangeR) {
        assert rangeL <= rangeR;
        Integer[] arr = new Integer[n];
        for(int i=0; i<n; i++) {
            arr[i] = (int) (Math.random() * (rangeR - rangeL + 1) + rangeL);
        }
        return arr;
    }

}
