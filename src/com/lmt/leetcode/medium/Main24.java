package com.lmt.leetcode.medium;

import java.util.List;

import com.lmt.leetcode.common.ListNode;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2021-01-12
 */
public class Main24 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;


        ListNode head = new Main24().swapPairs(l1);

        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }

    }
    public ListNode swapPairs(ListNode head) {
        ListNode pre = new ListNode(-1);
        pre.next = head;
        ListNode newHead = pre;
        while (head != null && head.next != null) {
            ListNode next = head.next;
            ListNode nextNext = next.next;
            pre.next = next;
            next.next = head;
            head.next = nextNext;
            pre = head;
            head = head.next;
        }
        return newHead.next;
    }
}
