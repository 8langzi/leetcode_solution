package com.leetcode.solution.mid;

public class Test53 {

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
//        int[] nums = {1};
//        int[] nums = {5,4,-1,7,8};
//        int[] nums = {-1};

        int i = maxSubArray(nums);
        System.out.println(i);
    }

    /**
     * 返回最大连续子序列的和
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {
        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        int maxNum = dp[0];

        for (int i = 1; i < nums.length; i++) {
            if(dp[i-1] > 0){
                dp[i] = nums[i] + dp[i-1];
            }else {
                dp[i] = nums[i];
            }
        }

        for (int max:dp){
            maxNum = Math.max(max,maxNum);
        }

        return maxNum;
    }

}
