package ds.linkedlist;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Louis
 * @date Create in 2019/10/27 13:45
 */
public class PrintListReverse {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    /**
     * 6 从尾到头打印链表
     * https://www.nowcoder.com/practice/d0267f7f55b3412ba93bd35cfa8e8035
     * 思路1：递归
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
//    ArrayList<Integer> res = new ArrayList<Integer>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//        if(listNode==null){
//            return res;
//        }
//        printListFromTailToHead(listNode.next);
//        res.add(listNode.val);
//        return res;
        /**
         * 思路2：模拟栈，利用List的add(index, value)方法
         * 时间复杂度：O(n)
         * 空间复杂度：O(n)
         */
        // 模拟栈，每次在第一个位置插入元素，取出来的就是最新的元素
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (listNode != null) {
            list.add(0, listNode.val);
            listNode = listNode.next;
        }
        return list;
    }

    /**
     * main
     */
    public static void main(String[] args) {
        PrintListReverse printListReverse = new PrintListReverse();
        ListNode head = printListReverse.new ListNode(1);
        head.next = printListReverse.new ListNode(2);
        head.next.next = printListReverse.new ListNode(3);
        // ==> [3,2,1]
        ArrayList<Integer> res = printListReverse.printListFromTailToHead(head);
        System.out.println(res.toString());
    }
}
