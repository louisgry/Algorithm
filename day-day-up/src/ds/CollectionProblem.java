package ds;
import java.util.*;

public class CollectionProblem {

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
