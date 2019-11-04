package L800_900.L876;

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
    public static ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode temp = head;
        ListNode cur = head;
        while(temp != null){
            length++;
            temp =temp.next;
        }
        int location = 0;
        while(true){
            if(location == length/2){
                break;
            }
            cur = cur.next;
            location++;
        }
        return cur;
    }

    public static void main(String[] args) {
    }
}