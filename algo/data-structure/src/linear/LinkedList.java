package linear;

/**
 * @author Louis
 * @date Create in 2019/12/3 21:04
 */
public class LinkedList<E> {

    private class Node{
        public E e;
        public Node next;

        public Node(E e, Node next){
            this.e = e;
            this.next = next;
        }

        public Node(E e){
            this(e, null);
        }

        public Node(){
            this(null, null);
        }

        @Override
        public String toString(){
            return e.toString();
        }
    }

    private Node dummyHead;
    private int size;

    public LinkedList(){
        dummyHead = new Node();
        size = 0;
    }

    /**
     * 添加
     */
    public void add(int index, E e){
        if(index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed. Illegal index.");
        }
        Node prev = dummyHead;
        for(int i = 0 ; i < index ; i ++) {
            prev = prev.next;
        }
        prev.next = new Node(e, prev.next);
        size ++;
    }

    public void addFirst(E e){
        add(0, e);
    }

    public void addLast(E e){
        add(size, e);
    }

    /**
     * 删除
     */
    public E remove(int index){
        if(index < 0 || index >= size) {
            throw new IllegalArgumentException("Remove failed. Index is illegal.");
        }
        Node prev = dummyHead;
        for(int i = 0 ; i < index ; i ++) {
            prev = prev.next;
        }
        Node retNode = prev.next;
        prev.next = retNode.next;
        retNode.next = null;
        size --;
        return retNode.e;
    }

    public boolean remove(E e){
        Node prev = dummyHead;
        while(prev.next != null){
            if(prev.next.e.equals(e)) {
                break;
            }
            prev = prev.next;
        }
        if(prev.next != null){
            Node delNode = prev.next;
            prev.next = delNode.next;
            delNode.next = null;
            size --;
            return true;
        }
        return false;
    }

    public E removeFirst(){
        return remove(0);
    }

    public E removeLast(){
        return remove(size - 1);
    }

    /**
     * 查找
     */
    public E get(int index){

        if(index < 0 || index >= size) {
            throw new IllegalArgumentException("Get failed. Illegal index.");
        }
        Node cur = dummyHead.next;
        for(int i = 0 ; i < index ; i ++) {
            cur = cur.next;
        }
        return cur.e;
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
            throw new IllegalArgumentException("Set failed. Illegal index.");
        }

        Node cur = dummyHead.next;
        for(int i = 0 ; i < index ; i ++) {
            cur = cur.next;
        }
        cur.e = e;
    }

    /**
     * 包含
     */
    public boolean contains(E e){
        Node cur = dummyHead.next;
        while(cur != null){
            if(cur.e.equals(e)) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();

        Node cur = dummyHead.next;
        while(cur != null){
            res.append(cur + "->");
            cur = cur.next;
        }
        res.append("NULL");

        return res.toString();
    }

}
