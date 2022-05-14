package com.leetcode.solution.mid;

import java.util.Arrays;

public class Test16 {

    public static void main(String[] args) {
        int nums[] = {-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(nums,target));
    }

    public static int threeSumClosest(int[] nums, int target) {
        int length = nums.length;
        int best = 10000000;
        Arrays.sort(nums);

        for (int first = 0; first < length; first++) {
            int left = first + 1;
            int right = length - 1;
            while (left < right){
                int sum = nums[first] + nums[left] + nums[right];
                if(sum == target){
                    // 1. 相等的话，直接返回0，这是最接近的值
                    return sum;
                }
                if(Math.abs(sum - target) < Math.abs(best - target)){
                    best = sum;
                }
                // 如果和大于 目标值
                if(sum > target){
                    int right0 = right - 1;
                    while (left < right0 && nums[right0] == nums[right]){
                        right0 --;
                    }
                    right = right0;
                } else {
                    int left0 = left + 1;
                    while (left0 < right && nums[left0] == nums[left]){
                        left0 ++;
                    }
                    left = left0;
                }

            }
        }
        return best;
    }

}
