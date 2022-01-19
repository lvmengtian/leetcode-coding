package com.lmt.leetcode.easy;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2022-01-19
 */
public class Main136 {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int i = 0, len = nums.length; i < len; i++) {
            ans ^= nums[i];
        }
        return ans;
    }
}
