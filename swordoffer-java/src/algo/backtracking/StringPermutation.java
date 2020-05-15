package algo.backtracking;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Louis
 * @date Create in 2020/1/15 20:23
 */
public class StringPermutation {
    /**
     * 38-字符串的排列
     * - https://www.nowcoder.com/practice/fe6b651b66ae47d7acce78ffdd9a96c7
     */
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        if(str!=null && str.length()>0) {
            backtracking(str.toCharArray(), 0, res);
            // list按字典序排序
            Collections.sort(res);
        }
        return res;
    }
    private void backtracking(char[] cArr, int index, ArrayList<String> list) {
        if(index == cArr.length-1) {
            String str = String.valueOf(cArr);
            if(!list.contains(str)) {
                list.add(str);
            }
        }
        else {
            // 第二层，变换第一位
            for(int i=index; i<cArr.length; i++) {
                swap(cArr, i, index);
                // 第三层，变换第二位
                backtracking(cArr, index+1, list);
                // 再swap一次调整回原样
                swap(cArr, i, index);
            }
        }
    }
    private void swap(char[] cArr, int i, int j) {
        char t = cArr[i];
        cArr[i] = cArr[j];
        cArr[j] = t;
    }
    /** main */
    public static void main(String[] args) {
        System.out.println((new StringPermutation()).Permutation("abc"));
    }
}
