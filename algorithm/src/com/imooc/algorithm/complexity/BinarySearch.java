package com.imooc.algorithm.complexity;

/**
 * 2-3：简单的复杂度分析
 * 2-5：递归算法的时间复杂度分析
 * 3-1：从二分查找法看如何写出正确的程序
 */
public class BinarySearch {

    /**
     * 二分查找法
     * @param arr
     * @param n
     * @param target
     * @return target所在的index
     */
    private static int binarySearch(Comparable[] arr, int n, int target){
        assert n > 0;
        int l = 0, r = n-1;
        while (l<=r){
            int mid = l + (r-l)/2;
            if(arr[mid].compareTo(target)==0) return mid;
            if(arr[mid].compareTo(target)>0) r = mid - 1;
            else l = mid + 1;
        }
        // 没找到，返回-1
        return -1;
    }

    /**
     * 二分查找法（递归实现）
     */
    private static int binarySearch2(Comparable[] arr, int l, int r, int target){
       if(l>r)
           return -1;
       int mid = l + (r-l)/2;
       if(arr[mid].compareTo(target)==0)
           return mid;
       else if(arr[mid].compareTo(target)>0)
           return binarySearch2(arr, l, mid-1, target);
       else
           return binarySearch2(arr, mid+1, r, target);
    }

    // 修改变量的定义
//    private static int binarySearch(Comparable[] arr, int n, int target){
//        assert n > 0;
//        int l = 0, r = n;
//        while (l<r){
//            int mid = l + (r-l)/2;
//            if(arr[mid].compareTo(target)==0) return mid;
//            if(arr[mid].compareTo(target)>0) r = mid;
//            else l = mid + 1;
//        }
//        return -1;
//    }

    // main
    public static void main(String[] args) {
        Comparable[] arr = {1,2,3,4,5,6};
        int target = 4;
        System.out.println(binarySearch(arr, arr.length, target));
        System.out.println(binarySearch2(arr, 0, arr.length-1, target));
    }
}
