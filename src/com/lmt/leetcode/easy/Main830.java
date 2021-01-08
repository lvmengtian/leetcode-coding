package com.lmt.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created on 2021-01-08
 */
public class Main830 {
    /**
     * 遍历到最后一个字符 或 当前字符与下一个字符不等时，我们判断步长是否超过3，超过则加入集合。  无论是否超过3，都要重置步长为1
     */
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        int step = 1;
        for (int i = 0, len = s.length(); i < len; i++) {
            if (i == len - 1 || s.charAt(i) != s.charAt(i+1)) {
                if (step >= 3) {
                    res.add(Arrays.asList(i - step + 1, i));
                }
                step = 1;  // 重置step
            } else {
                step++;
            }
        }
        return res;
    }
}
