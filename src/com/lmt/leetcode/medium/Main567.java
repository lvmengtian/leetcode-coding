package com.lmt.leetcode.medium;

import java.util.Arrays;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2022-01-11
 */
public class Main567 {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) { return false; }
        if (s1.length() == 1) { return s2.contains(s1); }
        int len1 = s1.length();
        for (int i = 0, len2 = s2.length(); i < len2; i++) {
            int j = i + len1 <= len2 ? i + len1 : len2 - 1;
            String sub = s2.substring(i, j);
            if (isEqule(s1, sub)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEqule(String s1, String s2) {
        int[] arr1 = toIntArr(s1);
        int[] arr2 = toIntArr(s2);
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    private int[] toIntArr(String s) {
        int[] res = new int[26];
        for (int i = 0, len = s.length(); i < len; i++) {
            res[s.charAt(i) - 'a']++;
        }
        return res;
    }
}
