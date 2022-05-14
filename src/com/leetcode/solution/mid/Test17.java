package com.leetcode.solution.mid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test17 {

    public static void main(String[] args) {
        System.out.println(letterCombinations(""));
    }

    public static List<String> letterCombinations(String digits) {
        List<String> ambinations = new ArrayList<>();
        if(digits.length() == 0){
            return ambinations;
        }
        Map<Character, String> phoneMap = new HashMap<Character, String>(){{
            put('2',"abc");
            put('3',"def");
            put('4',"ghi");
            put('5',"jkl");
            put('6',"mno");
            put('7',"pqrs");
            put('8',"tuv");
            put('9',"wxyz");
        }};
        backtrack(ambinations,phoneMap,digits,0,new StringBuffer());
        return ambinations;
    }

    private static void backtrack(List<String> ambinations, Map<Character, String> phoneMap, String digits, int index, StringBuffer combination) {
        // 退出条件，当index长度与digits长度相同的时候
        if(digits.length() == index){
            ambinations.add(combination.toString());
            return;
        }
        char c = digits.charAt(index);
        String s = phoneMap.get(c);
        for (int i = 0; i < s.length(); i++) {
            combination.append(s.charAt(i));
            backtrack(ambinations, phoneMap, digits, index+1, combination);
            combination.deleteCharAt(index);
        }

    }






//    private void backtracktemp2(){
//        if(index == digits.length()){
//            ambinations.add(combination.toString());
//        } else {
//            char digit = digits.charAt(index);
//            String letters = phoneMap.get(digit);
//            int lettersCount = letters.length();
//            for (int i = 0; i < lettersCount; i++) {
//                combination.append(letters.charAt(i));
//                backtrack(ambinations, phoneMap, digits, index+1, combination);
//                combination.deleteCharAt(index);
//            }
//        }
//    }


}
