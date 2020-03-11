package algo.other;

/**
 * @author Louis
 * @date Create in 2020/3/11 16:32
 */
public class MultipyArray {
    /**
     * 66-构建乘积数组
     * - https://www.nowcoder.com/practice/94a4d381a68b47b7a8bed86f2975db46
     */
    public int[] multiply(int[] A) {
        int n = A.length;
        int[] B = new int[n];
        B[0] = 1;
        // 先计算下三角连乘
        for(int i=1; i<n; i++) {
            B[i] = B[i-1]*A[i-1];
        }
        // 再计算上三角连乘
        int tmp = 1;
        for(int j=n-2; j>=0; j--) {
            tmp *= A[j+1];
            B[j]*= tmp;
        }
        return B;
    }
    /** main */
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        int[] B = (new MultipyArray()).multiply(A);
        for(int i : B) {
            System.out.println(i);
        }
    }
}
