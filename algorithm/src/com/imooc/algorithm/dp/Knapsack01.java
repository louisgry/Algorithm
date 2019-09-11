package com.imooc.algorithm.dp;

import java.util.Arrays;

public class Knapsack01 {

//    int[][] memo;
    public int knapsack01(int[] w, int[] v, int C){
        /**
         * 记忆化搜索
         * 时间复杂度：O(n*C)
         * 空间复杂度：O(n*C)
         */
//        assert w.length==v.length && C>=0;
//        int n = w.length;
//        memo = new int[n][C+1];
//        for(int i=0; i<n; i++)
//            Arrays.fill(memo[i], -1);
//        return bestValue(w, v, n-1, C);
        /**
         * 动态规划
         * 时间复杂度：O(n*C)
         * 空间复杂度：O(n*C)
         */
//        assert w.length==v.length && C>=0;
//        int n = w.length;
//        if(n == 0 || C == 0)
//            return 0;
//        int memo[][] = new int[n][C+1]; // [0...C]
//        for(int i=0; i<n; i++)
//            Arrays.fill(memo[i], -1);
//        for(int j=0; j<=C; j++)
//            memo[0][j] = (j>=w[0]? v[0] : 0);
//        for(int i=1; i<n; i++)
//            for(int j=0; j<=C; j++) {
//                memo[i][j] = memo[i - 1][j];
//                if(j>=w[i]) // j -> c
//                    memo[i][j] = Math.max(memo[i][j], v[i]+memo[i-1][j-w[i]]);
//            }
//        return memo[n-1][C];
        /**
         * 优化：空间复杂度，只需要两行的元素，O(2*C)=O(C)
         */
//        assert w.length==v.length && C>=0;
//        int n = w.length;
//        if(n == 0 || C == 0)
//            return 0;
//        int memo[][] = new int[2][C+1]; // 优化
//        for(int i=0; i<2; i++)
//            Arrays.fill(memo[i], -1);
//        for(int j=0; j<=C; j++)
//            memo[0][j] = (j>=w[0]? v[0] : 0);
//        for(int i=1; i<n; i++)
//            for(int j=0; j<=C; j++) {
//                memo[i%2][j] = memo[(i-1)%2][j]; //优化
//                if(j>=w[i]) // j -> c
//                    memo[i%2][j] = Math.max(memo[i%2][j], v[i]+memo[(i-1)%2][j-w[i]]); //优化
//            }
//        return memo[(n-1)%2][C]; //优化
        /**
         * 优化2：在一行上做修改，O(C)
         */
        assert w.length==v.length && C>=0;
        int n = w.length;
        if(n == 0 || C == 0)
            return 0;
        int memo[] = new int[C+1]; // 优化
        Arrays.fill(memo, -1);
        for(int j=0; j<=C; j++)
            memo[j] = (j>=w[0]? v[0] : 0);
        for(int i=1; i<n; i++)
            for(int j=C; j>=w[i]; j--)  // 从右向左
                memo[j] = Math.max(memo[j], v[i]+memo[j-w[i]]);
        return memo[C];
    }

//    private int bestValue(int[] w, int[] v, int index, int c){
//        if(index<0 || c<=0)
//            return 0;
//        if(memo[index][c] != -1)
//            return memo[index][c];
//        int max = bestValue(w, v, index-1, c);
//        if(c>=w[index])
//            max = Math.max(max, v[index]+bestValue(w, v, index-1, c-w[index]));
//        memo[index][c] = max;
//        return max;
//    }

    // main
    public static void main(String[] args) {
        int[] w = {1, 2, 3};
        int[] v = {6, 10, 12};
        int C = 5;
        System.out.println((new Knapsack01()).knapsack01(w, v, C));
    }
}
