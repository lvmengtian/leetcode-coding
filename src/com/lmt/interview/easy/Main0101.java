package com.lmt.interview.easy;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2022-05-09
 */
public class Main0101 {
    public boolean isUnique(String astr) {
        int[] arr = new int[26];
        char[] chars = astr.toCharArray();
        for (char ch : chars) {
            if (arr[ch - 'a'] != 0) {
                return false;
            }
            arr[ch - 'a']++;
        }
        return true;
    }
}
