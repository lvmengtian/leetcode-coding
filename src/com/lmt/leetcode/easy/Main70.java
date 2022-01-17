package com.lmt.leetcode.easy;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2022-01-17
 */
public class Main70 {
    // 递归方式,但是数值越大会超时，可以采用循环的方式
    public int climbStairs1(int n) {
        if (n <= 3) {
            return n;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    // 循环
    public int climbStairs(int n) {
        int a = 1, b = 2;
        if (n <= 2) {return n;}
        while (n-- > 2) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
