package ds.hash;

import java.util.HashMap;

/**
 * @author Louis
 * @date Create in 2020/2/27 10:36
 */
public class ArrayFirstTimeElem {
    /**
     * 56-数组中只出现一次的数字
     * - https://www.nowcoder.com/practice/e02fdb54d7524710a7d664d082bb7811
     */
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        // 计算频率
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])) {
                map.put(array[i], 1);
            } else {
                map.put(array[i], map.get(array[i]) + 1);
            }
        }
        num1[0] = 0;
        for (Integer num : map.keySet()) {
            if (map.get(num) == 1) {
                if (num1[0] == 0) {
                    num1[0] = num;
                } else {
                    num2[0] = num;
                }
            }
        }
    }
}
