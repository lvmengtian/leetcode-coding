package com.lmt.leetcode.easy;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2022-01-11
 */
public class Main344 {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            right--;
            left++;
        }
    }
}
