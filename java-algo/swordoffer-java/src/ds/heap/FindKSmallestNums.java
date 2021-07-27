package ds.heap;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * @author Louis
 * @date Create in 2020/1/16 15:02
 */
public class FindKSmallestNums {
    /**
     * 40-最小的K个数
     * - https://www.nowcoder.com/practice/6a296eb82cf844ca8539b57c23e6e9bf
     */
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        // 边界条件判断
        if (k <= 0 || k > input.length) {
            return new ArrayList<>();
        }
        // 最大堆维护最小堆
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int num : input) {
            pq.add(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return new ArrayList<>(pq);
    }

    /**
     * main
     */
    public static void main(String[] args) {
        int[] nums = {5, 6, 7, 8, 1, 2, 3, 4};
        System.out.println((new FindKSmallestNums()).GetLeastNumbers_Solution(nums, 4));
    }
}
