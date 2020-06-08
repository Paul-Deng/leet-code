package L300_L400.L328;

import L200_300.L206.ListNode;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: L300_L400.L328
 * @Author: PaulDeng
 * @CreateTime: 2020-06-03 21:52
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode evenList = head.next;
        ListNode oddList = head;
        ListNode cur = head.next;
        while (cur != null && cur.next != null) {
            oddList.next = cur.next;
            cur = cur.next.next;
            evenList.next = cur.next.next;
        }
        return head;
    }
}