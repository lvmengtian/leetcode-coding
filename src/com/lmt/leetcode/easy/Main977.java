package com.lmt.leetcode.easy;

import java.util.Arrays;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2022-01-07
 */
public class Main977 {
    // 暴力解法
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    /**
     * 双指针
     * 只有前面有负数才会出现顺序与原先不一致，先遍历一遍找到所有的负数
     */
    public int[] sortedSquares1(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        for (int i = 0, j = len - 1, resIndex = len - 1; i <= j;) {
            if (nums[i] * nums[i] < nums[j] * nums[j]) {
                res[resIndex--] = nums[j] * nums[j];
                j--;
            } else {
                res[resIndex--] = nums[i] * nums[i];
                i++;
            }
        }
        return res;
    }
}
