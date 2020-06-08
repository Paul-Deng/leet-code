package Offer.Offer_022;

import L200_300.L206.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode curNode = head;
        int count = 1;
        while(curNode.next!=null){
            count++;
            curNode = curNode.next;
        }
        curNode = head;
        for (int i = 0; i < count - k; i++) {
            curNode = curNode.next;
        }
        return curNode;
    }
}