package oj; /**
 * @author Louis
 * @date Create in 2020/5/18 19:13
 */
import java.util.Scanner;
/**
 * input: 3
 *        1 2 3
 *        2 1 3
 *        3 2 1
 * output: 18
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0, x;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                x = sc.nextInt();
                ans += x;
            }
        }
        System.out.println(ans);
    }
}
