package ds.heap;

import java.util.PriorityQueue;

/**
 * @author Louis
 * @date Create in 2020/1/21 23:10
 */
public class MedianNum {
    /**
     * 41.1-数据流中的中位数
     * - https://www.nowcoder.com/practice/9be0172896bd43948f8a32fb954e1be1
     */
    // 最大堆：左边是较小的元素（多用Lambda表达式）
    private PriorityQueue<Integer> left = new PriorityQueue<>((o1, o2) -> o2 - o1);
    // 最小堆：右边是较大的元素
    private PriorityQueue<Integer> right = new PriorityQueue<>();
    // 个数
    private int n = 0;

    public void Insert(Integer num) {
        n++;
        // 保证两个堆平衡
        if (n % 2 == 0) {
            // 偶数：添加最小的到左边
            right.add(num);
            left.add(right.poll());
        } else {
            // 奇数：添加最大的到右边
            left.add(num);
            right.add(left.poll());
        }
    }

    public Double GetMedian() {
        if (n % 2 == 0) {
            return (left.peek() + right.peek()) / 2.0;
        } else {
            return (double) right.peek();
        }
    }

    /**
     * main
     */
    public static void main(String[] args) {
        MedianNum medianNum = new MedianNum();
        medianNum.Insert(2);
        medianNum.Insert(1);
        medianNum.Insert(3);
        medianNum.Insert(4);
    }
}
