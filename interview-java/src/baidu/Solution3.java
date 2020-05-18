package baidu;

/**
 * @author Louis
 * @date Create in 2020/3/28 21:41
 * https://exercise.acmcoder.com/online/online_judge_ques?ques_id=3364&konwledgeId=40
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(helper(str));
    }
    private static int helper(String str) {
        ArrayList<String> list = new ArrayList<>();
        int i, k = 0;
        for(i=0; i<str.length()-1; ) {
            String tmp = str.substring(k, ++i);
            // 如果list里面没有子串则添加
            if(list.indexOf(tmp) == -1) {
                list.add(tmp);
            }
            // 遇到新的不同的字母，k游标移动
            if(str.charAt(k) != str.charAt(i)) {
                k = i;
            }
        }
        return list.size();
    }
}
