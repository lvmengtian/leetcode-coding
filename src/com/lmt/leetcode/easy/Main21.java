package com.lmt.leetcode.easy;

import com.lmt.leetcode.common.ListNode;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2021-01-12
 */
public class Main21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode tail = head;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        tail.next = l1 == null ? l2 : l1;
        return head.next;
    }
}
