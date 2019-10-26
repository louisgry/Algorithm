package pointers;

/**
 * @Author: Louis
 * @Date: Create in 2019/09/14 11:54
 * @Description:
 */
public class ValidPalindrome {
    /**
     * 125 Valid Palindrome
     * https://leetcode.com/problems/valid-palindrome/
     * 思路：双指针
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public boolean isPalindrome(String s) {
        if(s==null)
            return true;
        String reg = "[^0-9a-zA-Z]";
        s = s.replaceAll(reg, "");
        System.out.println(s);
        int i=0, j=s.length()-1;
        boolean flag = true;
        while(i<j){
            char c1 = Character.toLowerCase(s.charAt(i));
            char c2 = Character.toLowerCase(s.charAt(j));
            if(c1 == c2){
                i++;
                j--;
            }
            else{
                flag = false;
                break;
            }
        }
        return flag;
    }
    /** main */
    public static void main(String[] args) {
        String s1= "A man, a plan, a canal: Panama";
        // ==> true
        System.out.println((new ValidPalindrome()).isPalindrome(s1));
        String s2= "race a car";
        // ==> false
        System.out.println((new ValidPalindrome()).isPalindrome(s2));
        String s3= "0p";
        // ==> false
        System.out.println((new ValidPalindrome()).isPalindrome(s3));
    }
}
