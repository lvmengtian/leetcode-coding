package com.lmt.leetcode.easy;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2021-01-18
 */
public class Main7 {
    public int reverse(int x) {
        int flag = x < 0 ? -1 : 1;
        int res = 0;
        x = Math.abs(x);
        while (x != 0) {
            if (res > (Integer.MAX_VALUE - x % 10) / 10) {
                // 溢出
                return 0;
            }
            res = res * 10 + x % 10;
            x = x / 10;
        }
        return flag * res;
    }
}
