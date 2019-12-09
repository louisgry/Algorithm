package tree;

import linear.ArrayList;

import java.util.PriorityQueue;

/**
 * @author Louis
 * @date Create in 2019/12/6 17:08
 */
public class Heap<E extends Comparable<E>> {
    /**
     *  Java PriorityQueue默认：最小堆
     */
    private ArrayList<E> data;

    public Heap(int capacity){
        data = new ArrayList<>(capacity);
    }

    public Heap(){
        data = new ArrayList<>();
    }

    public Heap(E[] arr){
        data = new ArrayList<>(arr);
        for(int i = parent(arr.length - 1) ; i >= 0 ; i --) {
            siftDown(i);
        }
    }

    /**
     * 添加
     */
    public void add(E e){
        data.addLast(e);
        siftUp(data.size() - 1);
    }

    /**
     * ShiftUp
     */
    private void siftUp(int k){

        while(k > 0 && data.get(parent(k)).compareTo(data.get(k)) < 0 ){
            data.swap(k, parent(k));
            k = parent(k);
        }
    }

    /**
     * ShiftDown
     */
    private void siftDown(int k){

        while(leftChild(k) < data.size()){
            // 在此轮循环中,data[k]和data[j]交换位置
            int j = leftChild(k);
            if( j + 1 < data.size() &&
                    data.get(j + 1).compareTo(data.get(j)) > 0 ) {
                j++;
            }
            // data[j] 是 leftChild 和 rightChild 中的最大值
            if(data.get(k).compareTo(data.get(j)) >= 0 ) {
                break;
            }
            data.swap(k, j);
            k = j;
        }
    }

    /**
     * 最值
     */
    public E findMin(){
        if(data.size() == 0) {
            throw new IllegalArgumentException("Can not findMax when heap is empty.");
        }
        return data.get(0);
    }

    public E extractMin(){
        E ret = findMin();
        data.swap(0, data.size() - 1);
        data.removeLast();
        siftDown(0);
        return ret;
    }

    /**
     * 替换
     */
    public E replace(E e){

        E ret = findMin();
        data.set(0, e);
        siftDown(0);
        return ret;
    }

    public int size(){
        return data.size();
    }

    public boolean isEmpty(){
        return data.isEmpty();
    }

    private int parent(int index){
        if(index == 0) {
            throw new IllegalArgumentException("index-0 doesn't have parent.");
        }
        return (index - 1) / 2;
    }

    private int leftChild(int index){
        return index * 2 + 1;
    }

    private int rightChild(int index){
        return index * 2 + 2;
    }

}
