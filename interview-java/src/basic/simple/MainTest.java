package basic.simple;

import java.util.Scanner;

/**
 * @author Louis
 * @date Create in 2020/3/2 15:40
 */
public class MainTest {
    public static void main(String[] args) {
        /** Math.round()：四舍五入（-0.5取0，0.5取1） */
        System.out.println(Math.round(-0.4)+", "+Math.round(-0.5)+", "+Math.round(-0.6));
        System.out.println(Math.round(0.4)+", "+Math.round(0.5)+", "+Math.round(0.6));

        /** 按位与 & */
        int count = 0;
        int x = 9999;
        while(x > 0) {
            count++;
            x = x&(x-1);
        }

        /** int to binary */
        System.out.println(Integer.toBinaryString(9999));

        /** 常量池 */
        Integer a = new Integer(3);
        Integer b = 3;
        int c = 3;
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(b==c);

        /** ctrl+D: EndOfFile(EOF) */
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            System.out.println(scanner.next());
        }

        /** 反转字符串 */
        String s1 = "123";
        String rev = new StringBuilder(s1).reverse().toString();
        System.out.println(rev);
    }
}
