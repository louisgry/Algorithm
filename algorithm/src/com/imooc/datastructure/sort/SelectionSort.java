package com.imooc.datastructure.sort;

public class SelectionSort {

    /**
     * 选择排序
     * 时间复杂度：O(n^2)
     */
    // 算法不允许产生任何的实例
    private SelectionSort(){}

    // sort
    public static void sort(int[] arr){ // Comparable[] arr
        int n = arr.length;
        for(int i=0; i<n; i++){
            // 寻找[i, n)区间里的最小值
            int minIndex = i;
            for(int j=i+1; j<n; j++)
                if(arr[j]<arr[minIndex])
                    minIndex = j;

            swap(arr, i, minIndex);
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
        SelectionSort.sort(arr);
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
