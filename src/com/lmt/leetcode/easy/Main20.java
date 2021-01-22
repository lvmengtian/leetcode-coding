package com.lmt.leetcode.easy;

import java.util.Stack;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2021-01-22
 */
public class Main20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chs = s.toCharArray();
        for (char ch : chs) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.empty()) {return false;}
                Character peek = stack.peek();
                if ( (ch == ')' && peek == '(') || (ch == '}' && peek == '{') || (ch == ']' && peek == '[')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
