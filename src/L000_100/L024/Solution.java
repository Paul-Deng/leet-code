package L000_100.L024;

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
    public static ListNode swapPairs(ListNode head) {
        ListNode preTail = new ListNode(-1);
        ListNode swapHead = preTail;
        ListNode cur = head;
        ListNode nextHead =head;
        ListNode temp = null;
        int num = 1;
        while(cur != null){
            if(num % 2 == 0){
                temp = preTail.next;
                nextHead = cur.next;
                preTail.next = cur;
                cur.next = temp;
                preTail = temp;
                cur = nextHead;
                temp.next = nextHead;
                num++;
                continue;
            }
            num++;
            preTail.next = cur;
            cur = cur.next;
        }
        if(nextHead != null){
            preTail.next = nextHead;
        }
        return swapHead.next;
    }

    public static void showList(ListNode head){
        ListNode cur = head;
        while(cur != null){
            System.out.println(cur);
            cur = cur.next;
            }
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
        ListNode listNode = swapPairs(head);
        showList(listNode);
    }
}