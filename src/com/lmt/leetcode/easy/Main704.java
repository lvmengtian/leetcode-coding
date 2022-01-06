package com.lmt.leetcode.easy;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2022-01-06
 */
public class Main704 {
    // 闭区间 终止条件是 l <= r
    public int search(int[] nums, int target) {
        int len = nums.length;
        if (len == 0) { return -1;}
        int l = 0, r = len - 1;  // 由于是[left, right]，所以right应该是右侧最大的可以取到的数，即len-1
        while (l <= r) {
            int mid = (r - l) / 2 + l;  // 防溢出
            int cur = nums[mid];
            if (cur == target) { return mid;}
            else if (cur < target) { l = mid + 1;}
            else { r = mid - 1;}
        }
        return -1;
    }

    // 左闭右开  终止条件是 l < r
    public int search2(int[] nums, int target) {
        int len = nums.length;
        if (len == 0) { return -1;}
        int l = 0, r = len;             // 由于是[left, right),所以right就是len右侧的开区间
        while (l < r) {
            int mid = (r - l) / 2 + l;
            int cur = nums[mid];
            if (cur == target) { return mid;}
            else if (cur < target) { l = mid + 1;}
            else { r = mid;}
        }
        return -1;
    }
}
