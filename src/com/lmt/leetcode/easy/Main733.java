package com.lmt.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2022-01-12
 * 0 0 0
 * 0 1 1
 */

public class Main733 {
    public static void main(String[] args) {
        int[][] image = {{0,0,0}, {0,1,1}};
        int rows = image.length;
        int cols = image[0].length;
        int sr = 1, sc = 1, newColor = 1;
        image = new Main733().floodFill(image, sr, sc, newColor);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int rows = image.length;
        int cols = image[0].length;
        List<int[]> list = new ArrayList<>();
        list.add(new int[]{sr, sc});
        int origin = image[sr][sc];
        if (newColor == origin) {
            return image;
        }
        while (!list.isEmpty()) {
            int[] arr = list.get(0);
            list.remove(0);
            sr = arr[0];
            sc = arr[1];
            image[sr][sc] = newColor;
            if (sr - 1 >= 0 && image[sr - 1][sc] == origin) {
                image[sr - 1][sc] = newColor;
                list.add(new int[]{sr - 1, sc});
            }
            if (sr + 1 < rows && image[sr + 1][sc] == origin) {
                image[sr + 1][sc] = newColor;
                list.add(new int[]{sr + 1, sc});
            }
            if (sc - 1 >= 0 && image[sr][sc - 1] == origin) {
                image[sr][sc - 1] = newColor;
                list.add(new int[]{sr, sc - 1});
            }
            if (sc + 1 < cols && image[sr][sc + 1] == origin) {
                image[sr][sc + 1] = newColor;
                list.add(new int[]{sr, sc + 1});
            }
        }
        return image;
    }
}
