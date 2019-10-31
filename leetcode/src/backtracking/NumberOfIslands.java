package backtracking;

/**
 * @Author: Louis
 * @Date: Create in 2019/10/31 17:19
 * @Description:
 */
public class NumberOfIslands {
    /**
     * 200 Number of Islands
     * https://leetcode.com/problems/number-of-islands/
     * 思路：回溯法，递归树查找右上左下
     * 时间复杂度：O(n*m)
     * 空间复杂度：O(n*m)
     */
    private boolean[][] visited;
    private int[][] d = {{0,1},{1,0},{0,-1},{-1,0}};
    private int m, n;
    public int numIslands(char[][] grid) {
        // 非空判断
        if(grid.length==0 || grid[0].length==0) {
            return 0;
        }
        m = grid.length;
        n = grid[0].length;
        visited = new boolean[m][n];
        int res = 0;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(grid[i][j]=='1' && !visited[i][j]) {
                    dfs(grid, i, j);
                    res++;
                }
            }
        }
        return res;
    }
    private void dfs(char[][] grid, int x, int y) {
        visited[x][y] = true;
        for(int i=0; i<4; i++) {
            int newx = x + d[i][0];
            int newy = y + d[i][1];
            if(inArea(newx, newy) && grid[newx][newy]=='1' &&!visited[newx][newy]) {
                dfs(grid, newx, newy);
            }
        }
    }
    private boolean inArea(int x, int y){
        return x >= 0 && x < m && y >= 0 && y < n;
    }
    /** main */
    public static void main(String[] args) {
        char[][] grid = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        // ==> 1
        System.out.println((new NumberOfIslands()).numIslands(grid));
    }
}
