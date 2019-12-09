package linear;

/**
 * @author Louis
 * @date Create in 2019/12/3 19:20
 */
public class ArrayList<E> {

    private E[] data;
    private int size;

    public ArrayList(int capacity){
        data = (E[]) new Object[capacity];
        size = 0;
    }

    public ArrayList() {
        this(10);
    }

    public ArrayList(E[] arr){
        data = (E[])new Object[arr.length];
        for(int i = 0 ; i < arr.length ; i ++) {
            data[i] = arr[i];
        }
        size = arr.length;
    }
    /**
     * 添加
     */
    public void add(E e) {
        add(size, e);
    }

    public void addFirst(E e){
        add(0, e);
    }

    public void addLast(E e){
        add(size, e);
    }

    private void add(int index, E e) {
        if(index<0 || index>size) {
            throw new IllegalArgumentException("Require 0<index<size");
        }
        if(size == data.length) {
            grow(2*data.length);
        }
        for(int i=size-1; i>=index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }

    /**
     * 删除
     */
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Remove failed. Index is illegal.");
        }
        E ret = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size --;
        data[size] = null;
        // 避免在边界处size=capacity时反复调用grow
        if(size == data.length / 4 && data.length / 2 != 0) {
            grow(data.length / 2);
        }
        return ret;
    }

    public void remove(E e){
        int index = find(e);
        if(index != -1) {
            remove(index);
        }
    }

    public E removeFirst(){
        return remove(0);
    }

    public E removeLast(){
        return remove(size - 1);
    }

    private int find(E e){
        for(int i = 0 ; i < size ; i ++){
            if(data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 获取
     */
    public E get(int index){
        if(index < 0 || index >= size) {
            throw new IllegalArgumentException("Get failed. Index is illegal.");
        }
        return data[index];
    }

    public E getFirst(){
        return get(0);
    }

    public E getLast(){
        return get(size - 1);
    }

    /**
     * 修改
     */
    public void set(int index, E e){
        if(index < 0 || index >= size) {
            throw new IllegalArgumentException("Set failed. Index is illegal.");
        }
        data[index] = e;
    }

    /**
     * 包含
     */
    public boolean contains(E e){
        for(int i = 0 ; i < size ; i ++){
            if(data[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 动态扩容
     */
    private void grow(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity];
        for(int i=0; i<size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public int size() {
        return size;
    }

    public int getCapacity() {
        return data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void swap(int i, int j){
        if(i < 0 || i >= size || j < 0 || j >= size) {
            throw new IllegalArgumentException("Index is illegal.");
        }
        E t = data[i];
        data[i] = data[j];
        data[j] = t;
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d , capacity = %d\n", size, data.length));
        res.append('[');
        for(int i = 0 ; i < size ; i ++){
            res.append(data[i]);
            if(i != size - 1) {
                res.append(", ");
            }
        }
        res.append(']');
        return res.toString();
    }

}
