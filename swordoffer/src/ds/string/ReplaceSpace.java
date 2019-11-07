package ds.string;

/**
 * @Author: Louis
 * @Date: Create in 2019/10/26 21:45
 * @Description:
 */
public class ReplaceSpace {
    /**
     * 5 替换空格
     * https://www.nowcoder.com/practice/4060ac7e3e404ad1a894ef3e17650423
     * 思路：扫两遍：从前往后记录空格数，接着从后往前替换
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public String replaceSpace(StringBuffer str) {
        /**
         * 扫两遍：从前往后记录空格数，接着从后往前替换
         */
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ' ') {
                count++;
            }
        }
        char[] cArr = new char[str.length()+2*count];
        // 边界条件：>=
        for(int i=str.length()-1; i>=0; i--){
            if(str.charAt(i) != ' '){
                cArr[i+2*count] = str.charAt(i);
            }
            else {
                count--;
                cArr[i+2*count] = '%';
                cArr[i+2*count+1] = '2';
                cArr[i+2*count+2] = '0';
            }
        }
        return new String(cArr);
        /**
         * 调用自带replace函数
         */
        // return str.toString().replace(" ", "%20");
    }
    /** main */
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("We are happy");
        System.out.println((new ReplaceSpace()).replaceSpace(s));
    }
}
