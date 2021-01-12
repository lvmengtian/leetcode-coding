package com.lmt.leetcode.medium;

import com.lmt.leetcode.common.ListNode;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2021-01-10
 */
public class Main61 {

    public ListNode rotateRight(ListNode head, int k) {
        int len = length(head);
        if (len == k || len <= 1 || k == 0) { return head;}
        k = k % len;
        if (k == 0) {return head;}

        int step = len - k;
        ListNode tmp = head;
        while (step-- > 1) {
            tmp = tmp.next;
        }
        ListNode newHead = tmp.next;
        ListNode tmp2 = newHead;
        while (tmp2.next != null) {
            tmp2 = tmp2.next;
        }
        tmp2.next = head;
        tmp.next = null;
        return newHead;
    }

    private int length(ListNode head) {
        int len = 0;
        while (head != null) {
            head = head.next;
            len++;
        }
        return len;
    }
}
