package com.imooc.datastructure.sort;

public class InsertionSort {
    /**
     * 插入排序
     * 时间复杂度：O(n^2)
     */
    private InsertionSort(){}

    /** sort */
    public static void sort(int[] arr){
        /** 基础版 */
//        int n = arr.length;
//        for(int i=0; i<n; i++) {
//            for (int j = i; j > 0; j--) {
//                // 如果后面(arr[j])比前面(arr[j-1)小则swap
//                if (arr[j] < arr[j - 1]) {
//                    swap(arr, j, j - 1);
//                }
//                // 否则break
//                else {
//                    break;
//                }
//            }
//        }
        /** 优化：用赋值替换swap*/
        int n = arr.length;
        for(int i=0; i<n; i++){
            int e = arr[i];
            int j; // j保存e应该插入的位置
            for(j=i; j>0; j--) {
                if (arr[j - 1] > e) {
                    arr[j] = arr[j - 1];
                }
                else {
                    break;
                }
            }
            arr[j] = e;
        }
    }

    // swap
    private static void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    /** main */
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        InsertionSort.sort(arr);
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }

}
