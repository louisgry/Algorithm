package com.imooc.algorithm.complexity;

public class Vector<Item> {

    private Item[] data;
    private int size;
    private int capacity;

    public Vector(){
        data = (Item[]) new Object[100];
        size = 0;
        capacity = 100;
    }

    // 平均时间复杂度是O(1)
    public void push_back(Item e){
        if(size == capacity)
            resize(2*capacity);
        data[size++] = e;
    }

    // O(1)
    public Item pop_back(){
        if(size<=0)
            throw new IllegalArgumentException("can not pop back for empty vector.");
        Item ret = data[size-1];
        size --;

        // 防止复杂度的震荡
        if(size==capacity/4)
            resize(capacity/2);

//        return data[size];
        return ret;
    }

    // O(n)
    private void resize(int newCapacity){
        assert newCapacity >= size;
        Item[] newData = (Item[]) new Object[newCapacity];
        for(int i=0; i<size; i++)
            newData[i] = data[i];

        data = newData; // data是全局变量，无引用传递问题
        capacity = newCapacity;
    }

    // main
    public static void main(String[] args) {
        for(int i=10; i<=26; i++){
            int n = (int) Math.pow(2, i);
            Long startTime = System.currentTimeMillis();
            Vector<Integer> vector = new Vector<>();
            for(int num=0; num<n; num++)
                vector.push_back(num);
            Long endTime = System.currentTimeMillis();
            System.out.print(n + " operations: \t");
            System.out.println((endTime-startTime) + " ms");
        }
    }

}
