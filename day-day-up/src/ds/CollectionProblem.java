package ds;
import java.util.*;

/**
 * @author Louis
 * @date Create in 2019/11/26 10:01
 */
public class CollectionProblem {

    /**
     * https://leetcode.com/problems/two-sum/
     */
    public int[] twoSum(int[] nums, int target) {
        // map<数字，下标>
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int t = target - nums[i];
            if(map.containsKey(t)) {
                int[] res = {i, map.get(t)};
                return res;
            }
            map.put(nums[i], i);
        }
        throw new IllegalStateException("no solution");
    }

    /**
     * https://leetcode.com/problems/intersection-of-two-arrays-ii/
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums1) {
            if(!map.containsKey(num)){
                map.put(num, 1);
            }
            else {
                map.put(num, map.get(num)+1);
            }
        }
        List<Integer> result = new ArrayList<>();
        for(int num : nums2) {
            // 需要判断map含有num但是value=0的情况
            if(map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.get(num)-1);
            }
        }
        int[] res = new int[result.size()];
        int index = 0;
        for(Integer num : result) {
            res[index++] = num;
        }
        return res;
    }
    /**
     * https://leetcode.com/problems/intersection-of-two-arrays/
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums1.length; i++) {
            set.add(nums1[i]);
        }
        HashSet<Integer> resultSet = new HashSet<>();
        for(int num : nums2) {
            if(set.contains(num)) {
                resultSet.add(num);
            }
        }
        int[] res = new int[resultSet.size()];
        int index = 0;
        for(Integer num : resultSet) {
            res[index++] = num;
        }
        return res;
    }

    /**
     * https://leetcode.com/problems/single-number/
     */
    public int singleNumber(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<A.length; i++) {
            if(!map.containsKey(A[i])) {
                map.put(A[i], 1);
            }
            else {
                map.put(A[i], map.get(A[i]) + 1);
            }
        }
        for(Integer num : map.keySet()) {
            if(map.get(num) == 1) {
                return num;
            }
        }
        throw new IllegalStateException("no solution");
    }

}
