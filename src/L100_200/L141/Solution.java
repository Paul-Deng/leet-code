package L100_200.L141;

import L200_300.L206.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Map<ListNode,Integer> map = new HashMap<>();
        while(head != null){
            if (map.containsKey(head)) {
                return true;
            }
            map .put(head,1);
            head = head.next;
        }
        return false;
    }
}