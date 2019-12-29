package ds;
import java.util.*;

/**
 * @author Louis
 * @date Create in 2019/11/26 10:01
 */
public class CollectionProblem {

    /**
     * https://leetcode.com/problems/contains-duplicate-iii/
     */
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        // Set+滑动窗口：TreeSet(有序)，查找比x-t大的最小的元素(ceiling)是否<=x+t
        TreeSet<Long> set = new TreeSet<>();
        for(int i=0; i<nums.length; i++) {
            if(set.ceiling((long)nums[i]-(long)t)!=null && set.ceiling((long)nums[i]-(long)t)<=(long)nums[i]+(long)t) {
                return true;
            }
            set.add((long)nums[i]);
            // 滑动窗口
            if(set.size() == k+1) {
                set.remove((long)nums[i-k]);
            }
        }
        return false;
    }
    /**
     * https://leetcode.com/problems/contains-duplicate-ii/
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Set+滑动窗口
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            if(set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            // 保持set里面只有k个
            if(set.size() == k+1) {
                set.remove(nums[i-k]);
            }
        }
        return false;
    }
    /**
     * https://leetcode.com/problems/number-of-boomerangs/
     */
    public int numberOfBoomerangs(int[][] points) {
        int res = 0;
        // 1. 以i为中枢点
        for(int i=0; i<points.length; i++) {
            // 2. 把到i的距离的平方放入map<距离，频数>
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int j=0; j<points.length; j++) {
                if(j != i) {
                    int dist = distSquare(points[i], points[j]);
                    if(!map.containsKey(dist)) {
                        map.put(dist, 1);
                    }
                    else {
                        map.put(dist, map.get(dist) + 1);
                    }
                }
            }
            // 3. 组合个数=频数*频数-1
            for(Integer dist : map.keySet()) {
                res += map.get(dist) * (map.get(dist)-1);
            }
        }
        return res;
    }
    private int distSquare(int[] p1, int[] p2) {
        return (p1[0]-p2[0])*(p1[0]-p2[0])+(p1[1]-p2[1])*(p1[1]-p2[1]);
    }
    /**
     * https://leetcode.com/problems/4sum-ii/
     */
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        // 1. 把C+D的所有可能性放入map<C+D，频次>
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<C.length; i++) {
            for(int j=0; j<D.length; j++) {
                if(!map.containsKey(C[i]+D[j])) {
                    map.put(C[i]+D[j], 1);
                }
                else {
                    map.put(C[i]+D[j], map.get(C[i]+D[j])+1);
                }
            }
        }
        // 2. 查找0-A-B
        int res = 0;
        for(int i=0; i<A.length; i++) {
            for(int j=0; j<B.length; j++) {
                if(map.containsKey(0-A[i]-B[j])) {
                    res += map.get(0-A[i]-B[j]);
                }
            }
        }
        return res;
    }
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
