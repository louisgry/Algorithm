package array;

/**
 * @Author: Louis
 * @Date: Create in 2019/10/24 19:05
 * @Description:
 */
public class DuplicateNumberInArray {
    /**
     * 数组中重复的数字
     * https://www.nowcoder.com/practice/623a5ac0ea5b4e5f95552655361ae0a8
     */
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        int[] freq = new int[length];
        for(int i=0; i<numbers.length; i++) {
            freq[numbers[i]]++;
            if(freq[numbers[i]]>1){
                duplication[0] = numbers[i];
                return true;
            }
        }
        return false;
    }
    /** main */
    public static void main(String[] args) {
        int[] numbers = {2,3,1,0,2,5,3};
        int[] duplication = new int[7];
        boolean res = (new DuplicateNumberInArray()).duplicate(numbers, 7, duplication);
        // ==> true
        System.out.println(res);
        // ==> 2
        System.out.println(duplication[0]);
    }
}
