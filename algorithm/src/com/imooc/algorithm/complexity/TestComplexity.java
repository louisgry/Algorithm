package com.imooc.algorithm.complexity;

import com.imooc.algorithm.utils.TestUtil;

/**
 * 2-4：亲自试验自己算法的时间复杂度
 */
public class TestComplexity {

    public static void main(String[] args) {

        /** findMax: O(n) ==> 规模增加两倍，时间翻一倍 */
        System.out.println("Test for findMax:");
        for( int i = 10 ; i <= 26 ; i ++ ){

            int n = (int)Math.pow(2, i);
            Integer[] arr = TestUtil.generateRandomArray(n, 0, 100000000);

            long startTime = System.currentTimeMillis();
            Integer maxValue = TestAlgorithms.findMax(arr, n);
            long endTime = System.currentTimeMillis();

            System.out.print("data size 2^" + i + " = " + n + "\t");
            System.out.println("Time cost: " + (endTime - startTime) + " ms");
        }

        /** selectionSort: O(n^2) ==> 规模增加两倍，时间翻四倍 */
        System.out.println("Test for Selection Sort:");
        for( int i = 10 ; i <= 16 ; i ++ ){

            int n = (int)Math.pow(2,i);
            Integer[] arr = TestUtil.generateRandomArray(n, 0, 100000000);

            long startTime = System.currentTimeMillis();
            TestAlgorithms.selectionSort(arr, n);
            long endTime = System.currentTimeMillis();

            System.out.print("data size 2^" + i + " = " + n + "\t");
            System.out.println("Time cost: " + (endTime - startTime) + " ms");
        }

        /** binarySearch: O(logn) ==> 规模增加两倍，2亿数据规模时间也不到0ms */
        System.out.println("Test for Binary Search:");
        for(int i = 10 ; i <= 26 ; i ++){

            int n = (int)Math.pow(2, i);
            Integer[] arr = TestUtil.generateOrderedArray(n);

            long startTime = System.currentTimeMillis();
            TestAlgorithms.binarySearch(arr, n, 0);
            long endTime = System.currentTimeMillis();

            System.out.print("data size 2^" + i + " = " + n + "\t");
            System.out.println("Time cost: " + (endTime - startTime) + " ms");
        }

        /** mergeSort: O(nlogn) ==> 规模增加两倍，时间差不多翻一倍 */
        System.out.println("Test for Merge Sort:");
        for( int i = 10 ; i <= 26 ; i ++ ){

            int n = (int)Math.pow(2,i);
            Integer[] arr = TestUtil.generateRandomArray(n, 0, 1<<30);

            long startTime = System.currentTimeMillis();
            TestAlgorithms.mergeSort(arr, n);
            long endTime = System.currentTimeMillis();

            System.out.print("data size 2^" + i + " = " + n + "\t");
            System.out.println("Time cost: " + (endTime - startTime) + " s");
        }

    }

}
