package linear;

/**
 * @author Louis
 * @date Create in 2019/12/3 19:59
 */
public class Stack<E> {
    /**
     * Stack based on ArrayList (or LinkList)
     */
    private ArrayList<E> arrayList;

    public Stack(int capacity) {
        arrayList = new ArrayList<>(capacity);
    }

    public Stack() {
        arrayList = new ArrayList<>();
    }

    public void push(E e){
        arrayList.addLast(e);
    }

    public E pop(){
        return arrayList.removeLast();
    }

    public E peek(){
        return arrayList.getLast();
    }

    public int size(){
        return arrayList.size();
    }

    public boolean empty(){
        return arrayList.isEmpty();
    }

    public int getCapacity(){
        return arrayList.getCapacity();
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Stack: ");
        res.append('[');
        for(int i = 0; i < arrayList.size() ; i ++){
            res.append(arrayList.get(i));
            if(i != arrayList.size() - 1) {
                res.append(", ");
            }
        }
        res.append("] top");
        return res.toString();
    }

}
