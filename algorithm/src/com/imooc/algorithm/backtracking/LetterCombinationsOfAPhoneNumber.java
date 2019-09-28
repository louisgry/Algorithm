package com.imooc.algorithm.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Louis
 * @Date: Create in 2019/9/22 11:03
 * @Description:
 */
public class LetterCombinationsOfAPhoneNumber {
    /**
     *
     */
    private String[] letterMap = {
            // 0
            " ",
            // 1
            "",
            // 2
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
    };
    private ArrayList<String> resultList;
    public List<String> letterCombinations(String digits) {
        resultList = new ArrayList<String>();
        if (digits.equals("")) {
            return resultList;
        }
        findCombination(digits, 0, "");
        return resultList;
    }
    // s保存从digits[0...index-1]的字符串
    private void findCombination(String digits, int index, String s) {
        if (index==digits.length()) {
            resultList.add(s);
            return;
        }
        Character c = digits.charAt(index);
        String letters = letterMap[c-'0'];
        for (int i=0; i<letters.length(); i++) {
            findCombination(digits, index+1, s+letters.charAt(i));
        }
        return;
    }

    private static void printList(List<String> list){
        for(String s: list) {
            System.out.print(s + " ");
        }
    }
    /**
     * main
     */
    public static void main(String[] args) {
        printList((new LetterCombinationsOfAPhoneNumber()).letterCombinations("23"));
    }
}
