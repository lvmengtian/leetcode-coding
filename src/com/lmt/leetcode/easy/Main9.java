package com.lmt.leetcode.easy;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2021-01-21
 */
public class Main9 {
    /**
     * 重新组合之后值相等
     */
    public boolean isPalindrome(int x) {
        if (x < 0) {return false;}
        if (x < 10) {return true;}
        int tmp = x;
        int y = 0;
        while (tmp != 0) {
            y = y * 10 + tmp % 10;
            tmp = tmp / 10;
        }
        return y == x;
    }
}
