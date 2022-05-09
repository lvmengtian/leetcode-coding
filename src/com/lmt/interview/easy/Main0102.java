package com.lmt.interview.easy;

import java.util.Arrays;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2022-05-09
 */
public class Main0102 {
    public boolean CheckPermutation(String s1, String s2) {
        //return reorder(s1).equals(reorder(s2));
        return countChar(s1, s2);
    }

    // 重排序
    private String reorder(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    private boolean countChar(String s1, String s2) {
        int[] arr1 = countChar(s1);
        int[] arr2 = countChar(s2);
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    // 统计字符数量
    private int[] countChar(String s) {
        int[] arr = new int[26];
        for (char ch : s.toCharArray()) {
            arr[ch - 'a']++;
        }
        return arr;
    }
}
