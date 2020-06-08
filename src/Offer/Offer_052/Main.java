package Offer.Offer_052;

import L200_300.L206.ListNode;

import java.util.HashMap;

class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode, Integer> listNodeIntegerHashMap = new HashMap<>();
        ListNode result = null;
        Integer integer = new Integer(0);
        ListNode curA = headA;
        while(curA!=null){
            listNodeIntegerHashMap.put(headA,headA.val);
            curA = curA.next;
        }
        ListNode listNodeB = headB;
        while(listNodeB!=null) {
            if (listNodeIntegerHashMap.containsKey(listNodeB)) {
                result = listNodeB;
                integer = listNodeIntegerHashMap.get(listNodeB);
            }
            listNodeB = listNodeB.next;
        }
        if(integer != null) {
            System.out.println("Reference of the node with value =" + integer);
        }
        return result;
    }
}
