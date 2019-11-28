package backtracking;

import java.util.*;
/**
 * @author Louis
 * @date Create in 2019/10/31 17:35
 */
public class NQueens {
    /**
     * 51 N Queens
     * https://leetcode.com/problems/n-queens/
     * 思路：回溯法
     * 时间复杂度：O(n^n)
     * 空间复杂度：O(n)
     */
    private boolean[] col;
    private boolean[] dia1;
    private boolean[] dia2;
    private ArrayList<List<String>> res;
    public List<List<String>> solveNQueens(int n) {
        res = new ArrayList<List<String>>();
        col = new boolean[n];
        dia1 = new boolean[2*n-1];
        dia2 = new boolean[2*n-1];

        putQueen(n, 0, new LinkedList<Integer>());
        return res;
    }
    private void putQueen(int n, int index, LinkedList<Integer> row){
        if(index == n) {
            res.add(generateBoard(n, row));
            return;
        }

        for(int i=0; i<n; i++) {
            if(!col[i] && !dia1[index+i] && !dia2[index-i+n-1]) {
                row.addLast(i);
                col[i] = true;
                dia1[index+i] = true;
                dia2[index-i+n-1] = true;
                putQueen(n, index+1, row);
                col[i] = false;
                dia1[index + i] = false;
                dia2[index - i + n - 1] = false;
                row.removeLast();
            }
        }
        return;
    }
    private List<String> generateBoard(int n, LinkedList<Integer> row) {
        ArrayList<String> board = new ArrayList<String>();
        for(int i=0; i<n; i++) {
            char[] chars = new char[n];
            Arrays.fill(chars, '.');
            chars[row.get(i)] = 'Q';
            board.add(new String(chars));
        }
        return board;
    }
    /** main */
    public static void main(String[] args) {
        List<List<String>> res = (new NQueens()).solveNQueens(4);
        for(List<String> row : res) {
            System.out.println(row.toString());
        }
    }
}
