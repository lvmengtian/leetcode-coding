package com.lmt.leetcode.easy;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2022-01-06
 */
public class Main35 {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int l = 0, r = nums.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            int cur = nums[mid];
            if (cur == target) {
                return mid;
            } else if (cur < target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        // 没有找到
        return l + (r - l) / 2;
    }

    public static void main(String[] args) {
        int[] nums  = new int[] {1,3,5,6};
        int target = 2;
        System.out.println(new Main35().searchInsert(nums, target));
    }
}
