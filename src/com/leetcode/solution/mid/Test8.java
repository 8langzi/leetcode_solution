package com.leetcode.solution.mid;

import javax.xml.stream.events.Characters;

public class Test8 {

    public static void main(String[] args) {
        System.out.println(myAtoi("-2147483648"));
    }

    public static int myAtoi(String s) {
        int num = 0;
        char[] chars = s.toCharArray();
        int length = chars.length;
        boolean negative = false;
        int index = 0;
        while (index < length && chars[index] == ' '){
            index ++;
        }
        if(index == length){
            return 0;
        }
        if(chars[index] == '-'){
            negative = true;
            index ++;
        } else if(chars[index] == '+'){
            index ++;
        } else if(!Character.isDigit(chars[index])){
            return 0;
        }
        while (index < length && Character.isDigit(chars[index])){
            int digit = chars[index] - '0';
            if(num > (Integer.MAX_VALUE - digit) / 10){
                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            num = num * 10 + digit;
            index ++;
        }


        return negative ? -num : num;
    }

}
