package com.lmt.leetcode.medium;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2022-01-07
 */
public class Main189 {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        if (k != 0) {
            int tmp = nums[0];
            for (int i = 0, moveCnt = 0; moveCnt < len;) {
                int j = (i + k) % len;
                int t = nums[j];
                nums[j] = tmp;
                tmp = t;
                i = j;
                moveCnt++;
            }
        }
    }

    // 空间O(n)
    public void rotate1(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        int[] res = new int[len];
        if (k != 0) {
            for (int i = 0; i < len; i++) {
                res[(i + k) % len] = nums[i];
            }
            for (int i = 0; i < len; i++) {
                nums[i] = res[i];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] {-1,-100,3,99};
        int k = 2;
        new Main189().rotate1(nums, k);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
