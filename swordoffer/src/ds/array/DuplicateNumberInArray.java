package ds.array;

/**
 * @Author: Louis
 * @Date: Create in 2019/10/24 19:05
 * @Description:
 */
public class DuplicateNumberInArray {
    /**
     * 3 数组中重复的数字
     * https://www.nowcoder.com/practice/623a5ac0ea5b4e5f95552655361ae0a8
     * 思路：Hash Table
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers==null || length==0) {
            return false;
        }
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

        // 【WA】输入为空时，没有进行边界条件判断
        int[] numbers1 = {};
        int[] duplication1 = new int[7];
        boolean res1 = (new DuplicateNumberInArray()).duplicate(numbers1, 7, duplication1);
        // ==> false
        System.out.println(res1);
        // ==> -1
        System.out.println(duplication1[0]);
    }
}
