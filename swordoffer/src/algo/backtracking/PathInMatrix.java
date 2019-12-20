package algo.backtracking;

/**
 * @author Louis
 * @date Create in 2019/12/20 23:02
 */
public class PathInMatrix {
    /**
     * 12-矩阵中的路径
     * https://www.nowcoder.com/practice/c61c6999eecb4b8f88a98f66b273a3cc
     */
    private boolean[] visited;
    private int[][] d = {{-1,0},{0,1},{1,0},{0,-1}};
    int m, n;
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str){
        m = rows;
        n = cols;
        visited = new boolean[matrix.length];
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if(search(matrix, rows, cols, str, 0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }
    private boolean search(char[] matrix, int rows, int cols, char[] str, int index, int startx, int starty) {
        if(index == str.length-1) {
            return matrix[startx*cols+starty] == str[index];
        }
        if(matrix[startx*cols+starty] == str[index]) {
            visited[startx*cols+starty] = true;
            // 四个方向寻找
            for(int i=0; i<4; i++) {
                int newx = startx + d[i][0];
                int newy = starty + d[i][1];
                if(inArea(newx, newy) && !visited[newx*cols+newy]) {
                    if(search(matrix, rows, cols, str, index+1, newx, newy)) {
                        return true;
                    }
                }
            }
            visited[startx*cols+starty] = false;
        }
        return false;
    }
    private boolean inArea(int x, int y) {
        return x>=0 && x<m && y>=0 && y<n;
    }

    public static void main(String[] args) {
        char[] matrix = {'a','b','t','g','c','f','c','s','j','d','e','h'};
        char[] str = {'b','f','c','e'};
        System.out.println((new PathInMatrix()).hasPath(matrix, 4, 4, str));

    }
}
