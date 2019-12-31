package ds;
import javafx.util.Pair;

import java.util.*;

/**
 * @author Louis
 * @date Create in 2019/11/27 20:01
 */
public class QueueProblem {

    /**
     * https://leetcode.com/problems/top-k-frequent-elements/
     */
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }
            else {
                map.put(nums[i], map.get(nums[i])+1);
            }
        }
        PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<Pair<Integer, Integer>>(new PairComparator());
        // 遍历map，维护大小为k的优先队列
        for(Integer num : map.keySet()) {
            int freq = map.get(num);
            // 如果队列没有满，入队
            if(pq.size() != k) {
                pq.add(new Pair(freq, num));
            }
            else {
                if(freq > pq.peek().getKey()) {
                    pq.poll();
                    pq.add(new Pair(freq, num));
                }
            }
        }
        List<Integer> res = new ArrayList<Integer>();
        while(!pq.isEmpty()) {
            res.add(pq.poll().getValue());
        }
        return res;
    }
    private class PairComparator implements Comparator<Pair<Integer, Integer>> {
        @Override
        public int compare(Pair<Integer, Integer> p1, Pair<Integer, Integer> p2) {
            if(p1.getKey() != p2.getKey()) {
                return p1.getKey() - p2.getKey();
            }
            return p1.getValue() - p2.getValue();
        }
    }

}
