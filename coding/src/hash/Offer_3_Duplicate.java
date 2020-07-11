package hash;


/**
 * @author Louis
 * @date Create in 2020/7/11 23:26
 */
import java.util.Set;
import java.util.HashSet;
public class Offer_3_Duplicate {
    /** 3-数组中重复的数字 */
    public boolean duplicate(int numbers[], int length, int[] duplication) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<length; i++) {
            if(!set.contains(numbers[i])) {
                set.add(numbers[i]);
            }
            else {
                duplication[0] = numbers[i];
                return true;
            }
        }
        return false;
    }
    /** main */
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,1,2};
        int[] duplication = new int[numbers.length];
        System.out.println((new Offer_3_Duplicate()).duplicate(numbers, numbers.length, duplication));
        System.out.println(duplication[0]);
    }
}
