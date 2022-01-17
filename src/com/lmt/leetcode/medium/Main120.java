package com.lmt.leetcode.medium;

import java.util.List;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2022-01-17
 */
public class Main120 {
    // 二维数组
    public int minimumTotal(List<List<Integer>> triangle) {
        int size = triangle.size();
        // 加1可以不用初始化最后一层
        int[][] dp = new int[size + 1][size + 1];
        for (int i = size - 1; i >= 0; i--) {
            List<Integer> curRow = triangle.get(i);
            for (int j = 0; j < curRow.size(); j++) {
                dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + curRow.get(j);
            }
        }
        return dp[0][0];
    }

    /**
     * 一维数组
     */
    public int minimumTotal1(List<List<Integer>> triangle) {
        // 只需要记录每一层的最小值即可
        int[] dp = new int[triangle.size()+1];

        for (int i = triangle.size() - 1; i >= 0; i--) {
            List<Integer> curRow = triangle.get(i);
            for (int j = 0; j < curRow.size(); j++) {
                //这里的dp[j] 使用的时候默认是上一层的，赋值之后变成当前层
                dp[j] = Math.min(dp[j],dp[j+1]) + curRow.get(j);
            }
        }
        return dp[0];
    }
}
