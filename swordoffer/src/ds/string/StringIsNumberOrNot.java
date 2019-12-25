package ds.string;

import java.util.regex.Pattern;

/**
 * @author Louis
 * @date Create in 2019/12/25 21:57
 */
public class StringIsNumberOrNot {
    /**
     * 20-表示数值的字符串
     * https://www.nowcoder.com/practice/6f8c901d091949a5837e24bb82a731f2
     */
    public boolean isNumeric(char[] str) {
        return Pattern.matches("^[+-]?\\d*(?:\\.\\d*)?(?:[eE][+\\-]?\\d+)?$", new String(str));
    }
    /** main */
    public static void main(String[] args) {
        System.out.println((new StringIsNumberOrNot()).isNumeric(new char[]{'+','1','0'}));
        System.out.println((new StringIsNumberOrNot()).isNumeric(new char[]{'5','e','2'}));
        System.out.println((new StringIsNumberOrNot()).isNumeric(new char[]{'+','-','0'}));
    }
}
