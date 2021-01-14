package com.lmt.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2021-01-14
 */
public class Main1018 {
    /**
     * 只关注最后一位数字是否可以整除5即可。如果计算十进制会溢出
     */
    public List<Boolean> prefixesDivBy5(int[] A) {
        int len = A.length;
        List<Boolean> res = new ArrayList<>(len);

        int num = 0;

        for (int value : A) {
            num <<= 1;
            num += value;
            num %= 10;
            res.add(num % 5 == 0);
        }

        return res;
    }
}
