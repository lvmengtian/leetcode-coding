package com.lmt.leetcode.easy;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2022-01-18
 */
public class Main231 {
    /**
     * 2的幂的二进制应该只有1个1
     */
    public boolean isPowerOfTwo1(int n) {
        int cnt = 0;
        while (n > 0) {
            n = (n - 1) & n;
            cnt++;
        }
        return cnt == 1;
    }

    /**
     * 2的幂的二进制应该只有1个1
     */
    public boolean isPowerOfTwo(int n) {
        return n > 0 && ((n - 1) & n) == 0;
    }
}
