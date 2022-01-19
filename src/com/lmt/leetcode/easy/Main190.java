package com.lmt.leetcode.easy;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2022-01-19
 */
public class Main190 {
    public int reverseBits(int n) {
        int ans = 0;
        for (int i = 0; i < 32 && n != 0; i++) {
            // n & 1 取二进制的最后一位
            // 将这一位左移 放入ans
            ans |= (n & 1) << (31 - i);
            n = n >>> 1;
        }
        return ans;
    }
}
