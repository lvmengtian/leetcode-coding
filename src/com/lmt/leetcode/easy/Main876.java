package com.lmt.leetcode.easy;

import com.lmt.leetcode.common.ListNode;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2022-01-11
 */
public class Main876 {
    // 快慢指针
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
