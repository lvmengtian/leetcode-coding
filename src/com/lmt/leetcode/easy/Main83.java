package com.lmt.leetcode.easy;

import static com.lmt.leetcode.common.CommonTools.buildLinkList;
import static com.lmt.leetcode.common.CommonTools.printLinkList;

import com.lmt.leetcode.common.ListNode;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2021-01-19
 */
public class Main83 {

    public static void main(String[] args) {
        Main83 main83 = new Main83();
        printLinkList(main83.deleteDuplicates(buildLinkList(1, 1, 2)));
        printLinkList(main83.deleteDuplicates(buildLinkList(1, 1, 1, 2)));
        printLinkList(main83.deleteDuplicates(buildLinkList(1, 1, 1, 2, 2)));
        printLinkList(main83.deleteDuplicates(buildLinkList(1, 1, 1, 2, 2, 3)));
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode newHead = head;
        while (head != null) {
            ListNode next = head.next;
            while (next != null && head.val == next.val) {
                next = next.next;
            }
            head.next = next;
            head = next;
        }
        return newHead;
    }
}
