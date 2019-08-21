package com.imooc.algorithm.complexity;

public class TimeComplexity {

    // O(logn)：二分查找法
    private static int binarySearch(Comparable[] arr, int n, int target){
        int l = 0, r = n-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(arr[mid].compareTo(target)==0)
                return mid;
            if(arr[mid].compareTo(target)>0)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        // 二分查找
        Comparable[] arr = {3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(arr, 8, 5));
    }
}
