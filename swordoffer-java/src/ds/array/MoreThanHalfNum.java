package ds.array;

/**
 * @author Louis
 * @date Create in 2020/1/15 21:54
 */
public class MoreThanHalfNum {
    /**
     * 39-数组中出现次数超过一半的数字
     * - https://www.nowcoder.com/practice/e8a1b01a2df14cb2b228b30ee6a92163
     */
    public int MoreThanHalfNum_Solution(int [] array) {
        // 第一遍扫描，得到候选节点
        int candidate = array[0];
        int count = 1;
        int n = array.length;
        for(int i=1; i<n; i++) {
            // 计数
            if(array[i] == candidate) {
                count++;
            }
            else {
                count--;
            }
            // 改变candidate
            if(count == 0) {
                candidate = array[i];
                count = 1;
            }
        }
        // 第二遍扫描，判断次数是否过半
        count = 0;
        for(int i=0; i<n; i++) {
            if(array[i] == candidate) {
                count++;
            }
        }
        if(count > n/2) {
            return candidate;
        }
        return 0;
    }
}
