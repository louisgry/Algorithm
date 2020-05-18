package ds.array;

import java.util.ArrayList;

/**
 * @author Louis
 * @date Create in 2020/1/2 22:06
 */
public class PrintArrayClockwise {
    /**
     * 29-顺时针打印矩阵
     * - https://www.nowcoder.com/practice/9b4c81a02cd34f76be2659fa0d54342a
     */
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return res;
        }
        // 定义四个变量表示范围，上下左右边界
        int up = 0, down = matrix.length - 1, left = 0, right = matrix[0].length - 1;
        while (up <= down && left <= right) {
            // 先向右记录
            for (int i = left; i <= right; i++) {
                res.add(matrix[up][i]);
            }
            // 再向下记录
            for (int i = up + 1; i <= down; i++) {
                res.add(matrix[i][right]);
            }
            // 再向左记录
            if (up != down) {
                for (int i = right - 1; i >= left; i--) {
                    res.add(matrix[down][i]);
                }
            }
            // 再向上记录（注意边界）
            if (left != right) {
                for (int i = down - 1; i > up; i--) {
                    res.add(matrix[i][left]);
                }
            }
            // 更新边界
            up++;
            down--;
            left++;
            right--;
        }
        return res;
    }

    /**
     * main
     */
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};
        System.out.println((new PrintArrayClockwise()).printMatrix(matrix).toString());
    }
}
