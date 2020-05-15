package ds.linkedlist;

/**
 * @author Louis
 * @date Create in 2020/1/12 22:00
 */
public class CopyComplexLinkedList {

    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    /**
     * 35-复杂链表的复制
     * - https://www.nowcoder.com/practice/f836b2c43afc4b35ad6adc41ec941dba
     */
    public RandomListNode Clone(RandomListNode pHead) {
        if(pHead == null) {
            return null;
        }
        // 1. 插入新节点
        RandomListNode cur = pHead;
        while(cur != null) {
            RandomListNode clone = new RandomListNode(cur.label);
            clone.next = cur.next;
            cur.next = clone;
            cur = clone.next;
        }
        // 2. 建立random链接
        cur = pHead;
        while(cur != null) {
            RandomListNode clone = cur.next;
            if(cur.random != null) {
                // random的下一个
                clone.random = cur.random.next;
            }
            cur = clone.next;
        }
        // 3. 拆分
        cur = pHead;
        RandomListNode cHead = pHead.next;
        // 要判断next是否为空
        while(cur.next != null) {
            RandomListNode next = cur.next;
            cur.next = next.next;
            cur = next;
        }
        return cHead;
    }
}
