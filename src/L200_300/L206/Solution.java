package L200_300.L206;


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode reverseHead = new ListNode(-1);
        ListNode next = head;
        ListNode cur = head;
        while(cur != null){
            next = next.next;
            cur.next = reverseHead.next;
            reverseHead.next = cur;
            cur = next;
        }
        return reverseHead.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);

        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        head.next = node1;

    }
}