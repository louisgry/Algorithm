package algo.partition;

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
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        // 边界条件，注意k的边界
        if(input==null || input.length==0 || k<=0 || k>input.length) {
            return res;
        }
        // 返回前k个是最小的
        findKSmall(input, k-1);
        for(int i=0; i<k; i++) {
            res.add(input[i]);
        }
        return res;
    }
    private void findKSmall(int[] nums, int k) {
        int l=0, r=nums.length-1;
        while(l < r) {
            int i = partition(nums, l, r);
            if(i == k) {
                break;
            }
            if(i > k) {
                r = i - 1;
            }
            else {
                l = i + 1;
            }
        }
    }
    private int partition(int[] nums, int l , int r){
        int p = nums[l];
        int i=l, j=r+1;
        while(true) {
            //
            while(i!=r && nums[++i]<p);
            while(j!=l && nums[--j]>p);
            if(i >= j) {
                break;
            }
            swap(nums, i, j);
        }
        //
        swap(nums, l, j);
        return j;
    }
    private void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    /** main */
    public static void main(String[] args) {
        int[] nums = {5,6,7,8,1,2,3,4};
        System.out.println((new FindKSmallestNums()).GetLeastNumbers_Solution(nums, 4));
        PriorityQueue<Integer> pq = new PriorityQueue<>(2);
        pq.add(4);
        pq.add(2);
        pq.add(1);
        pq.add(3);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }
}
