package com.lmt.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2022-07-15
 */
public class Main15 {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return null;
        }
        int len = nums.length;
        // 由小到大排序
        Arrays.sort(nums);
        if (nums[0] > 0 || nums[len - 1] < 0) {
            return null;
        }
        List<List<Integer>> resList = new ArrayList<>();
        for (int first = 0; first < len; first++) {
            // 去除重复的
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }
            int third = len - 1;
            for (int second = first + 1; second < len; second++) {
                // 去除重复的
                if (second > first + 1 && nums[second] == nums[second - 1]) {
                    continue;
                }
                while (second < third && nums[second] + nums[third] > -nums[first]) {
                    third--;
                }
                if (second == third) {
                    break;
                }
                if (nums[second] + nums[third] + nums[first] == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[third]);
                    resList.add(list);
                }
            }
        }
        return resList;
    }
}
