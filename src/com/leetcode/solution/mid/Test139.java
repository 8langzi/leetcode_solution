package com.leetcode.solution.mid;

import java.util.*;

public class Test139 {

    public static void main(String[] args) {
        System.out.println(wordBreak("applepenapple", Arrays.asList("apple", "pen")));

    }
    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordKeys = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if(dp[j] && wordKeys.contains(s.substring(j,i))){
                    dp[i] = true;
                }
            }
        }
        

        return dp[s.length()];
    }
}
