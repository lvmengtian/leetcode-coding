package com.lmt.leetcode.medium;

import com.lmt.leetcode.common.ListNode;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2020-12-26
 */
public class Main2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) { return l1 == null ? l2 : l1;}

        ListNode head = new ListNode();
        ListNode tail = head;

        int flag = 0;

        while (l1 != null || l2 != null) {
            int v1 = l1 == null ? 0 : l1.val;
            int v2 = l2 == null ? 0 : l2.val;
            int sum = v1 + v2 + flag;
            flag = sum / 10;

            tail.next = new ListNode(sum % 10);
            tail = tail.next;

            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }

        if (flag != 0) {
            tail.next = new ListNode(flag);
        }
        return head.next;
    }
}
