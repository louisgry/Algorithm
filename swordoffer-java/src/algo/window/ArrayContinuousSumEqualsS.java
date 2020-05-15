package algo.window;

import java.util.ArrayList;

/**
 * @author Louis
 * @date Create in 2020/2/27 11:44
 */
public class ArrayContinuousSumEqualsS {
    /**
     * 57.2-和为S的连续正数序列
     * - https://www.nowcoder.com/practice/c451a3fd84b64cb19485dad758a55ebe
     */
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        // 两个起点，代表滑动窗口的两边
        int i=1, j=2;
        while(i < j) {
            // 等差数列求和=(a0+an)*n/2
            int t = (i+j)*(j-i+1)/2;
            if(t == sum) {
                ArrayList<Integer> list = new ArrayList<>();
                for(int k=i; k<=j; k++) {
                    list.add(k);
                }
                res.add(list);
                // 左边窗口右移
                i++;
            }
            // 当前窗口值小于sum，则右窗口应该右移
            else if(t < sum) {
                j++;
            }
            // 当前窗口值大于sum，则左窗口应该右移
            else {
                i++;
            }
        }
        return res;
    }

}
