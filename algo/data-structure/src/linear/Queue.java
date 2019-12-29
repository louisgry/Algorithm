package linear;

/**
 * @author Louis
 * @date Create in 2019/12/3 20:09
 */
public class Queue<E> {
    /**
     * Queue based on ArrayList (or LinkList)
     */
    private ArrayList<E> arrayList;

    public Queue(int capacity){
        arrayList = new ArrayList<>(capacity);
    }

    public Queue(){
        arrayList = new ArrayList<>();
    }


    public void add(E e){
        arrayList.addLast(e);
    }

    public E poll(){
        return arrayList.removeFirst();
    }

    public E peek(){
        return arrayList.getFirst();
    }

    public int size(){
        return arrayList.size();
    }

    public boolean isEmpty(){
        return arrayList.isEmpty();
    }

    public int getCapacity(){
        return arrayList.getCapacity();
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Queue: ");
        res.append("front [");
        for(int i = 0; i < arrayList.size() ; i ++){
            res.append(arrayList.get(i));
            if(i != arrayList.size() - 1) {
                res.append(", ");
            }
        }
        res.append("] tail");
        return res.toString();
    }
}
