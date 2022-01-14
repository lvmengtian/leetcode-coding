package com.lmt.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

import jdk.internal.org.objectweb.asm.util.CheckSignatureAdapter;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2022-01-14
 * 2 2 0
 * 2 2 0
 * 0 1 1
 */
public class Main944 {
    public static void main(String[] args) {
        int[][] grid = new int[][]{{2,1,1}, {1,1,0}, {0,1,1}};
        System.out.println(new Main944().orangesRotting(grid));
    }
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        List<int[]> list = init(rows, cols, grid);
        int step = 0;
        while (!list.isEmpty()) {
            // 将list的内容全部copy出来，清空list
            List<int[]> bak = new ArrayList<>(list);
            list.clear();
            boolean hasChanged = false;
            for (int i = 0; i < bak.size(); i++) {
                int[] cur = bak.get(i);
                int row = cur[0], col = cur[1];
                if (row - 1 >= 0 && grid[row - 1][col] == 1) {
                    // 上面的好橘子变坏
                    grid[row - 1][col] = 2;
                    hasChanged = true;
                    list.add(new int[] {row - 1, col});
                }
                if (row + 1 < rows && grid[row + 1][col] == 1) {
                    // 下面的好橘子变坏
                    grid[row + 1][col] = 2;
                    hasChanged = true;
                    list.add(new int[] {row + 1, col});
                }
                if (col - 1 >= 0 && grid[row][col - 1] == 1) {
                    // 左侧的好橘子变坏
                    grid[row][col - 1] = 2;
                    hasChanged = true;
                    list.add(new int[] {row, col - 1});
                }
                if (col + 1 < cols && grid[row][col + 1] == 1) {
                    // 右侧的好橘子变坏
                    grid[row][col + 1] = 2;
                    hasChanged = true;
                    list.add(new int[] {row, col + 1});
                }
            }
            step = hasChanged ? step + 1 : step;
        }

        return checkAllBad(rows, cols, grid) ? step : -1;
    }

    private List<int[]> init(int rows, int cols, int[][] grid) {
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    list.add(new int[]{i, j});
                }
            }
        }
        return list;
    }

    // 遍历完成后，检查是否全部变坏
    private boolean checkAllBad(int rows, int cols, int[][] grid) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    // 没有全部变坏，说明有一些橘子一直不会变坏，返回-1
                    return false;
                }
            }
        }
        return true;
    }
}
