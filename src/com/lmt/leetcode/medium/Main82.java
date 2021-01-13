package com.lmt.leetcode.medium;

import com.lmt.leetcode.common.ListNode;

/**
 * @author lvmengtian <lvmengtian@kuaishou.com>
 * Created on 2021-01-13
 */
public class Main82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode preHead = new ListNode(-1);
        preHead.next = head;
        ListNode pre = preHead;
        while (head != null && head.next != null) {
            ListNode cur = head;
            ListNode next = cur.next;
            if (next.val == cur.val) {
                // 出现重复节点时，pre无需移动
                while (next != null && next.val == cur.val) {
                    next = next.next;
                }
                pre.next = next;
                head = next;
            } else {
                pre.next = cur;
                head = cur.next;
                // 出现非重复节点时，pre需要移动到pre.next
                pre = pre.next;
            }
        }
        return preHead.next;
    }
}
