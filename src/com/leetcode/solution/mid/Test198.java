package com.leetcode.solution.mid;

public class Test198 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(rob(nums));
    }

    // 0是不偷 1是偷
    public static int rob(int[] nums) {
        int length = nums.length;
        if (length == 0) return 0;
        int[] dp = new int[length + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2; i <= length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i-1], dp[i - 1]);
        }
        return dp[length];
    }
}
