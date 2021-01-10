package com.lmt.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2021-01-10
 */
public class Main228 {
    public static void main(String[] args) {
        int[] nums = new int[]{0,2,3,4,6,8,9};
        List<String> res = new Main228().summaryRanges(nums);
        System.out.println(Arrays.toString(res.toArray()));
    }
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        for (int i = 0, len = nums.length; i < len;) {
            int j = i;
            while (j + 1 < len && nums[j + 1] - nums[j] == 1) {
                j++;
            }
            int start = nums[i];
            int end = nums[j];
            res.add(start == end ? String.valueOf(start) : start + "->" + end);
            i = j + 1;
        }
        return res;
    }
}
