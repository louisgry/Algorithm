package baidu;

/**
 * @author Louis
 * @date Create in 2020/3/28 21:15
 * https://exercise.acmcoder.com/online/online_judge_ques?ques_id=3821&konwledgeId=40
 */
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0; i<n; i++) {
            String str = scan.next();
            System.out.println(helper(str));
        }
        scan.close();
    }
    private static String helper(String str) {
        // 判断是哪种，进行转换
        if(str.matches("R\\d+C\\d+")) {
            return changeToBC(str);
        }
        return changeToRC(str);
    }
    private static String changeToBC(String str) {
        int col=0, row=0;
        boolean isRow = true;
        for(char c : str.toCharArray()) {
            if(c <= '9') {
                if(isRow)
                    row = row*10 + c - '0';
                else
                    col = col*10 + c - '0';
            }
            else {
                isRow = c=='R';
            }
        }
        String s = "";
        while(col > 0) {
            int t = (col-1)%26 + 1;
            s = (char)(t+'A'-1) + s;
            col = (col-1)/26;
        }
        return s+row;
    }
    private static String changeToRC(String str) {
        int col=0, row=0;
        for(char c : str.toCharArray()) {
            if(c >= 'A')
                col = col*26 + c -'A' + 1;
            else
                row = row*10 + c - '0';
        }
        return "R"+row+"C"+col;
    }
}
