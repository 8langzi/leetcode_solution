package com.leetcode.solution.mid;

import java.util.ArrayList;
import java.util.List;

public class Test22 {

    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateParenthesis(n));
    }

    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generate(list,"",0,0,n);
        return list;
    }

    public  static void generate(List<String> list,String res,int left,int right,int n){
        if(left > n || right > n){
            return;
        }
        if(left == n && right == n){
            list.add(res);
            return;
        }
        if(left >= right){
            generate(list, res + "(", left+1, right, n);
            generate(list, res+")", left, right+1, n);
        }

    }

}
