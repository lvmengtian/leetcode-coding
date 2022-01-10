package com.lmt.leetcode.easy;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2022-01-10
 */
public class Main283 {

    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 1) { return;}
        int len = nums.length;
        int i = 0, j = 0;
        while (j < len) {
            if (nums[j] != 0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                i++;
            }
            j++;
        }
    }

    /**
     * 双指针, 遍历i指向从左向右第一个为0的位置；j指向从左向右大于i的第一个不为0的位置。然后进行交换
     */
    public void moveZeroes1(int[] nums) {
        if (nums == null || nums.length == 1) { return;}
        int len = nums.length;
        int i = 0, j = 0;
        while (j < len) {
            while (i < len && nums[i] != 0) { i++;}
            j = i + 1;
            while (j < len && nums[j] == 0) { j++;}
            if (i >= j || j >= len) {break;}
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
    }
}
