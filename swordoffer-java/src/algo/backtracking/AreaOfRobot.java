package algo.backtracking;

/**
 * @author Louis
 * @date Create in 2019/12/21 22:02
 */
public class AreaOfRobot {
    /**
     * 13-机器人的运动范围
     * https://www.nowcoder.com/practice/6e5207314b5241fb83f2329e89fdecc8
     */
    boolean[][] visited;
    public int movingCount(int threshold, int rows, int cols) {
        visited = new boolean[rows][cols];
        return getNumber(threshold, rows, cols, 0, 0);
    }

    private int getNumber(int threshold, int rows, int cols, int x, int y) {
        if(!inArea(threshold, rows, cols, x, y) || visited[x][y]) {
            return 0;
        }
        visited[x][y] = true;
        return getNumber(threshold, rows, cols, x-1, y)
                + getNumber(threshold, rows, cols, x+1, y)
                + getNumber(threshold, rows, cols, x, y-1)
                + getNumber(threshold, rows, cols, x, y+1)
                + 1;
    }
    private boolean inArea(int threshold, int rows, int cols, int x, int y) {
        if(x<0 || x>=rows || y<0 || y>=cols || numSum(x)+numSum(y)>threshold) {
            return false;
        }
        return true;
    }
    private int numSum(int x) {
        int res = 0;
        while(x != 0) {
            res += x%10;
            x /= 10;
        }
        return res;
    }

    /** main */
    public static void main(String[] args) {
        System.out.println((new AreaOfRobot()).movingCount(18, 40, 40));
    }
}
