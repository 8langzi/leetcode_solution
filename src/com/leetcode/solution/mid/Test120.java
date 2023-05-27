package com.leetcode.solution.mid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test120 {

    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<>(Arrays.asList(2)));
        triangle.add(new ArrayList<>(Arrays.asList(3,4)));
        triangle.add(new ArrayList<>(Arrays.asList(6,5,9)));
        triangle.add(new ArrayList<>(Arrays.asList(4,4,8,0)));
        System.out.println(minimumTotal(triangle));
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int [][] dp = new int[n][n];
        dp[0][0] = triangle.get(0).get(0);


        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i-1][0] + triangle.get(i).get(0);
            for (int j = 1; j < i; j++) {
                dp[i][j] = Math.min(dp[i-1][j-1],dp[i-1][j]) + triangle.get(i).get(j);
            }
            dp[i][i] = dp[i-1][i-1] + triangle.get(i).get(i);
        }
        
        int min = dp[n-1][0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min,dp[n-1][i]);
        }
        return min;
    }

}
