package L100_200.L148;

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
    public static ListNode insertionSortList(ListNode head) {
        if(head.next.next == null){
            return head;
        }
        ListNode preHead = head;
        ListNode sortHead = head;
        ListNode sort = sortHead;
        while(preHead.next!=null){
            int min = preHead.next.val;
            ListNode curNode = preHead.next;
            ListNode minNodePre = null;
            while(curNode.next !=null){
                if(curNode.next.val < min){
                    min = curNode.next.val;
                    minNodePre = curNode;
                }
                curNode = curNode.next;
            }
            ListNode reversalNode = preHead.next;
            while(reversalNode !=minNodePre){
                reversalNode = reversalNode.next;
            }
            sort.next = reversalNode.next;
            reversalNode.next =reversalNode.next.next;
            sort = sort.next;
            sort.next = null;
        }

        return sortHead;
    }

    public static void showList(ListNode head){
        ListNode cur = head;
        while(cur.next != null){
            cur = cur.next;
            System.out.print(cur.val+"->");
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(-1);
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(3);
        head.next = node1;
        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
        insertionSortList(head);
        showList(head);
    }
}