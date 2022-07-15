package com.lmt.leetcode.medium;

import java.util.Arrays;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2022-07-15
 */
public class Main16 {
    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3) {
            return -1;
        }
        int len = nums.length;
        // 由小到大排序
        Arrays.sort(nums);
        int closestSum = Integer.MAX_VALUE;

        for (int first = 0; first < len; first++) {
            // 去除重复的
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }
            int second = first + 1, third = len - 1;
            while (second < third) {
                int sum = nums[first] + nums[second] + nums[third];
                if (sum == target) {
                    return sum;
                }
                // 根据绝对差值更新
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }
                if (sum > target) {
                    // third向左移动
                    int tmp = third - 1;
                    while (second < tmp && nums[third] == nums[tmp]) {
                        tmp--;
                    }
                    third = tmp;
                } else {
                    // second向右移动
                    int tmp = second + 1;
                    while (tmp < third && nums[second] == nums[tmp]) {
                        tmp++;
                    }
                    second = tmp;
                }
            }
        }
        return closestSum;
    }
}
