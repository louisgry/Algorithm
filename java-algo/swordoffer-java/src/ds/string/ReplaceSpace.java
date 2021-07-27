package ds.string;

/**
 * @author Louis
 * @date Create in 2019/10/26 21:45
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
        // 从前往后遍历，记录空格数
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        // 从后往前，替换
        char[] charArr = new char[str.length() + 2 * count];
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                charArr[i + 2 * count] = str.charAt(i);
            } else {
                count--;
                charArr[i + 2 * count] = '%';
                charArr[i + 2 * count + 1] = '2';
                charArr[i + 2 * count + 2] = '0';
            }
        }
        return new String(charArr);
        /**
         * 调用自带replace函数
         */
        // return str.toString().replace(" ", "%20");
    }

    /**
     * main
     */
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("We are happy");
        System.out.println((new ReplaceSpace()).replaceSpace(s));
    }
}
