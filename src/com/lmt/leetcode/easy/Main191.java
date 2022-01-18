package com.lmt.leetcode.easy;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2022-01-18
 */
public class Main191 {
    public int hammingWeight(int n) {
        int cnt = 0;
        while (n != 0) {
            n = (n - 1) & n;
            cnt++;
        }
        return cnt;
    }
}
