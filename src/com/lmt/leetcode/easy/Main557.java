package com.lmt.leetcode.easy;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2022-01-11
 */
public class Main557 {
    public String reverseWords(String s) {
        char[] chs = s.toCharArray();
        int left = 0, right = 0;
        while (right < chs.length) {
            while (right < chs.length && chs[right] != ' ') {
                right++;
            }
            reverseSingleWord(chs, left, right - 1);
            left = right + 1;
            right = right + 1;
        }
        return new String(chs);
    }

    private void reverseSingleWord(char[] s, int left, int right) {
        while (left < right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            right--;
            left++;
        }
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(new Main557().reverseWords(s));
    }
}
