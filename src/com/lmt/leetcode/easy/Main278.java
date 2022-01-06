package com.lmt.leetcode.easy;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2022-01-06
 */
public class Main278 {
    public int firstBadVersion(int n) {
        // 把n看做数组处理，使用二分查找,左闭右开
        int l = 0, r = n;
        while (l < r) {
            int mid = (r - l) / 2 + l;
            boolean isBad = isBadVersion(mid + 1); // mid是数组下标，对应的version其实是mid+1
            if (isBad) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l + 1;
    }

    // 避免编译问题所以自定义了该方法
    private boolean isBadVersion(int version) {
        return true;
    }
}
