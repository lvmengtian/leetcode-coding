package com.lmt.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2021-01-15
 */
public class Main1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0, len = nums.length; i < len; i++) {
            int num = nums[i];
            if (map.containsKey(num)) {
                return new int[]{map.get(num), i};
            } else {
                map.put(target - num, i);
            }
        }
        return new int[]{-1, -1};
    }
}
