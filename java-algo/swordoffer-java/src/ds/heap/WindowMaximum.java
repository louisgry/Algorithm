package ds.heap;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * @author Louis
 * @date Create in 2020/2/22 22:20
 */
public class WindowMaximum {
    /**
     * 59-滑动窗口的最大值
     * - https://www.nowcoder.com/practice/1624bc35a45c42c0bc17d17fa0cba788
     */
    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> res = new ArrayList<>();
        // 边界条件判断
        if (size < 1 || size > num.length) {
            return res;
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int i = 0; i < size; i++) {
            maxHeap.add(num[i]);
        }
        res.add(maxHeap.peek());
        // i从1到n-size
        for (int i = 1; i <= num.length - size; i++) {
            // 删除上一个访问过的元素
            maxHeap.remove(num[i - 1]);
            // 添加size长度的下一个元素
            maxHeap.add(num[i + size - 1]);
            res.add(maxHeap.peek());
        }
        return res;
    }

    /**
     * main
     **/
    public static void main(String[] args) {
        int[] num = {2, 3, 4, 2, 6, 2, 5, 1};
        int size = 3;
        System.out.println((new WindowMaximum()).maxInWindows(num, size));
    }
}
