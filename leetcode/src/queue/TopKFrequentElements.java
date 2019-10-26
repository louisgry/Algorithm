package queue;

import javafx.util.Pair;

import java.util.*;

/**
 * @Author: Louis
 * @Date: Create in 2019/10/26 16:55
 * @Description:
 */
public class TopKFrequentElements {
    /**
     * 347 Top K Frequent Elements
     * https://leetcode.com/problems/top-k-frequent-elements/
     * 思路：优先队列
     * 时间复杂度：O(nlogk)
     * 空间复杂度：O(n+k)
     */
    public List<Integer> topKFrequent(int[] nums, int k) {
        // 统计每个元素出现的频率：map（元素，频率）
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++) {
            if(!freq.containsKey(nums[i])) {
                freq.put(nums[i], 1);
            }
            else {
                freq.put(nums[i], freq.get(nums[i])+1);
            }
        }
        // 维护出现频率最高的k个元素：优先队列（频率，元素）
        PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<Pair<Integer, Integer>>(new PairComparator());
        for(Integer num : freq.keySet()) {
            int numFreq = freq.get(num);
            if(pq.size() == k) {
                if(numFreq > pq.peek().getKey()) {
                    pq.poll();
                    pq.add(new Pair<Integer, Integer>(numFreq, num));
                }
            }
            else {
                pq.add(new Pair<Integer, Integer>(numFreq, num));
            }
        }

        ArrayList<Integer> res = new ArrayList<Integer>();
        while(!pq.isEmpty()) {
            res.add(pq.poll().getValue());
        }
        return res;
    }
    // 基于Pair的最大堆
    private class PairComparator implements Comparator<Pair<Integer, Integer>> {
        @Override
        public int compare(Pair<Integer, Integer> p1, Pair<Integer, Integer> p2) {
            if(p1.getKey() != p2.getKey()) {
                return p1.getKey() - p2.getKey();
            }
            return p1.getValue() - p2.getValue();
        }
    }
    /** main */
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        List<Integer> res = (new TopKFrequentElements()).topKFrequent(nums, k);
        // ==> [1,2]
        System.out.println(res.toString());
    }
}
