package com.imooc.datastructure.sort;

public class BubbleSort {

    /**
     * 冒泡排序
     * 时间复杂度：O(n^2)
     */
    private BubbleSort(){}

    // sort
    public static void sort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++){
                if(arr[j]<arr[i])
                    swap(arr, i, j);
            }
    }

    // swap
    private static void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    // main
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        BubbleSort.sort(arr);
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
