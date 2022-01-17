package com.lmt.leetcode.medium;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2022-01-17
 */
public class Main198 {
    /**
     * 动态规划
     */
    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 1) {return nums[0];}
        // dp[i]表示偷完第i家的最大金额
        int[] dp = new int[len];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[1], nums[0]);
        for (int i = 2; i < len; i++) {
            // 偷第i家之后的金额是 dp[i - 2] + nums[i]
            // 不偷第i家的金额是 dp[i - 1]
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[len - 1];
    }
}
