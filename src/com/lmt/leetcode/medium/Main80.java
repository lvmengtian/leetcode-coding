package com.lmt.leetcode.medium;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2021-04-06
 */
public class Main80 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2,2};
        int len = new Main80().removeDuplicates(nums);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + ",");
        }
    }
    public int removeDuplicates(int[] nums) {
        int num = nums[0];
        int cnt = 1;
        int res = 1;
        for (int i = 1, len = nums.length; i < len; i++) {
            if (num == nums[i] && cnt < 2) {
                cnt++;
                res++;
            } else {
                if (num == nums[i]) {
                    int x = i + 1;
                    while (x + 1 < len) {
                        nums[x] = nums[x + 1];
                        x++;
                    }
                }
                if (num != nums[i + 1] && i + 1 == len) {
                    num = nums[i + 1];
                    cnt = 1;
                    res++;
                }
            }
        }
        return res;
    }
}
