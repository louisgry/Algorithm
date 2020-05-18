package oj; /**
 * @author Louis
 * @date Create in 2020/5/18 19:12
 */
import java.util.Scanner;
/**
 * input: 1 1
 * output: 2
 */
public class Main1 {
    // 本题为考试单行多行输入输出规范示例，无需提交，不计分。
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);
        }
    }
}

