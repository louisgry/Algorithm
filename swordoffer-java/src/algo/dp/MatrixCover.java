package algo.dp;

/**
 * @author Louis
 * @date Create in 2020/2/24 10:41
 */
public class MatrixCover {
    /**
     * 10.2-矩形覆盖
     * - https://www.nowcoder.com/practice/72a5a919508a4251859fb2cfb987a0e6
     */
    public int RectCover(int target) {
        if(target <= 2) {
            return target;
        }
        int t1 = 1, t2 = 2;
        int res = 0;
        for(int i=3; i<=target; i++) {
            res = t1 + t2;
            t1 = t2;
            t2 = res;
        }
        return res;
    }
}
