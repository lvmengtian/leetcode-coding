package com.lmt.leetcode.medium;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2022-05-06
 */
public class Main55 {

    /**
     * 思路，从后往前推理
     * 假设最后一个位置可达(len-1), 则需要看倒数第二个(n-2)是否可以达到(n-1),同理(n-3)是否可以达到(n-2)
     * @param nums
     * @return
     */
    public boolean canJump(int[] nums) {
       int len = nums.length;
       if (len == 1) {
           // 长度为1，一定可达
           return true;
       }
       // 最后一个位置当做终点(to), 判断位置from是否可以达到to
       int to = len - 1;
       int from = len - 2;
       while (from >= 0) {
           if (from + nums[from] >= to) {
               // 说明from可以达到to，则更新目的地
               to = from;
           }
           from--;
       }
       return to == 0;
    }
}
