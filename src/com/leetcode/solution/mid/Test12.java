package com.leetcode.solution.mid;

public class Test12 {

    public static void main(String[] args) {
        System.out.println(intToRoman(3));
    }
    /***
     *  @author: lh
     *  @Date: 2022/2/28 23:41
     *  @MethtodName intToRoman
     *  @params [num]
     *  @Description:
     *  1000 - M
     *   900 - CM
     *   500 - D
     *   400 - CD
     *   100 - C
     *   90  - XC
     *   50  - L
     *   40  - XL
     *   10  - X
     *   9   - IX
     *   5   - V
     *   4   - IV
     *   1   - I
     */
    public static String intToRoman(int num) {
        String []chars = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int []money = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String sum = "";

        for (int i = 0; i < 13; i++) {
            while (num >= money[i]){
                sum = sum + chars[i];
                num = num - money[i];
            }
        }
        return sum;
    }

}
