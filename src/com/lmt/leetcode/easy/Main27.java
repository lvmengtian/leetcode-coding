package com.lmt.leetcode.easy;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2021-01-20
 */
public class Main27 {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0, len = nums.length; i < len; i++) {
            if (nums[i] != val) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}
