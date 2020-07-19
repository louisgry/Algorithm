package hash;

/**
 * @author Louis
 * @date Create in 2020/7/11 23:43
 */
import java.util.Map;
import java.util.HashMap;
public class Offer_56_FindNumsAppearOnce {
    /** 56-数组中只出现一次的数字：https://www.nowcoder.com/practice/e02fdb54d7524710a7d664d082bb7811 */
    public void FindNumsAppearOnce(int[] array, int[] num1, int[] num2) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<array.length; i++) {
            if(!map.containsKey(array[i])) {
                map.put(array[i], 1);
            }
            else {
                map.put(array[i], map.get(array[i])+1);
            }
        }
        // 返回两个只出现一次的数字
        num1[0] = 0;
        for(Integer num : map.keySet()) {
            if(map.get(num) == 1) {
                if(num1[0] == 0) {
                    num1[0] = num;
                }
                else {
                    num2[0] = num;
                }
            }
        }
    }
    /** main */
    public static void main(String[] args) {
        int[] array = {1,2,3,4,2,3};
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        (new Offer_56_FindNumsAppearOnce()).FindNumsAppearOnce(array, num1, num2);
        System.out.println(num1[0] + " " + num2[0]);
    }
}
