package com.lmt.leetcode.easy;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2021-03-08
 */
public class Main13 {

    public int romanToInt(String s) {
        char[] chs = s.toCharArray();
        int result =getValue(chs[0]);
        int len = chs.length;
        for (int i = 1; i < len; i++) {
            if (isSpecial(chs[i], chs[i  -1])) {
                // chs[i-1]已经加过一次了，此处需要减2次
                result = result + getValue(chs[i]) - 2 * getValue(chs[i - 1]);
            } else {
                result += getValue(chs[i]);
            }
        }
        return result;
    }

    private boolean isSpecial(char cur, char pre) {
        return ((cur == 'V' || cur == 'X') && pre == 'I')
                || ((cur == 'L' || cur == 'C') && pre == 'X')
                || ((cur == 'D' || cur == 'M') && pre == 'C');
    }

    private int getValue(char ch) {
        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
