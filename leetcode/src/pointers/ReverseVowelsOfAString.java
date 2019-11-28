package pointers;

/**
 * @author Louis
 * @date Create in 2019/9/16 21:28
 */
public class ReverseVowelsOfAString {
    /**
     * 345 Reverse Vowels of a String
     * https://leetcode.com/problems/reverse-vowels-of-a-string/
     * 思路：双指针
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public String reverseVowels(String s) {
        int i=0, j=s.length()-1;
        char[] arr = s.toCharArray();
        String vowels = "aeiouAEIOU";
        while(i<j){
            if(!vowels.contains(arr[i]+"")){
                i++;
            }
            if(!vowels.contains(arr[j]+"")){
                j--;
            }
            if(vowels.contains(arr[i]+"")&&vowels.contains(arr[j]+"")){
                char c = arr[i];
                arr[i] = arr[j];
                arr[j] = c;
                i++;
                j--;
            }
        }
        return new String(arr);
    }

    /** main */
    public static void main(String[] args) {
        // ==> holle
        System.out.println((new ReverseVowelsOfAString()).reverseVowels("hello"));

        // ==> leotcede
        System.out.println((new ReverseVowelsOfAString()).reverseVowels("leetcode"));
    }
}
