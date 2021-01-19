package com.lmt.leetcode.common;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2021-01-19
 */
public class CommonTools {

    private CommonTools() {
        throw new UnsupportedOperationException("instantiation is not supported");
    }

    public static ListNode buildLinkList(int... vals) {
        ListNode head = new ListNode(vals[0]);
        ListNode tail = head;
        for (int i = 1, len = vals.length; i < len; i++) {
            tail.next = new ListNode(vals[i]);
            tail = tail.next;
        }
        return head;
    }

    public static void printLinkList(ListNode head) {
        StringBuilder builder = new StringBuilder();
        while (head != null) {
            builder.append(head.val).append("->");
            head = head.next;
        }
        builder.deleteCharAt(builder.length() - 1);
        builder.deleteCharAt(builder.length() - 1);
        System.out.println(builder);
    }
}
