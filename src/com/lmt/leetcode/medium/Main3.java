package com.lmt.leetcode.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2021-01-16
 */
public class Main3 {
    /**
     * 如果某个s[i]字符之前出现了，假设上一个位置是s[i']，则需要计算最长长度
     */
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> indexMap = new HashMap<>();
        int maxLen = 0;
        int i = 0, j = 0, len = s.length();
        for (; j < len; j++) {
            char ch = s.charAt(j);
            if (indexMap.containsKey(ch)) {
                i = Math.max(i, indexMap.get(ch) + 1);
            }
            maxLen = Math.max(j - i + 1, maxLen);
            indexMap.put(ch, j);
        }
        return maxLen;
    }
}
