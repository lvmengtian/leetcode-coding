package com.lmt.leetcode.medium;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2022-06-16
 */
public class Main45 {

    public static void main(String[] args) {
        int[] nums = new int[]{10,9,8,7,6,5,4,3,2,1,1,0};
        int jump = new Main45().jump(nums);
        System.out.println(jump);
    }

    public int jump(int[] nums) {
        int jump = 0;
        int i = 0, len = nums.length;
        if (len == 1) {
            return 0;
        }
        if (nums[0] >= len - 1) {
            return 1;
        }
        while (i < len) {
            // 选择[i + 1, nums[i]]的最大值
            int start = i + 1;
            if (start >= len - 1) {
                return jump + 1;
            }
            if (i + nums[i] >= len - 1) {
                return jump + 1;
            }
            int end = i + nums[i];
            int maxPos = findMaxPos(nums, start, end);
            jump += 1;
            i = maxPos;
        }
        return jump;
    }

    private int findMaxPos(int[] nums, int start, int end) {
        int max = nums[start];
        int maxPos = start;
        for (; start <= end; start++) {
            if (nums[start] >= max) {
                maxPos = start;
            }
            max = Math.max(nums[start], max);
        }
        return maxPos;
    }
}
