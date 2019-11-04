package L700_800.L707;

import L200_300.L206.ListNode;

import java.util.List;

class MyLinkedList {


    ListNode head = new ListNode(-1);
    /** Initialize your data structure here. */
    public MyLinkedList() {

    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        int i = 0;
        ListNode cur = head.next;
        while(cur !=null){
            if(i == index){
                return cur.val;
            }
            cur = cur.next;
            i++;
        }
        return -1;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        ListNode temp = new ListNode(val);
        if(head.next == null){
            head.next = temp;
            return;
        }
        temp.next = head.next;
        head.next = temp;
        return;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        ListNode cur = head.next;
        ListNode temp = new ListNode(val);
        while(true){
            if(cur.next == null){
                cur.next = temp;
                break;
            }
            cur = cur.next;
        }
        return;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index < 0){
            addAtHead(val);
            return;
        }
        ListNode pre = head;
        ListNode cur = head.next;
        ListNode temp = new ListNode(val);
        int location = 0;
        while(cur != null){
            if(location == index){
                pre.next = temp;
                temp.next = cur;
                return;
            }
            cur = cur.next;
            pre = pre.next;
            location++;
        }
        if(location + 1 == index){
            addAtTail(val);
        }
        return;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        ListNode pre = head;
        ListNode cur = head.next;
        int location = 0;
        while(cur.next != null){
            if(location == index){
                cur = cur.next;
                pre.next = cur;
                return;
            }
            cur = cur.next;
            pre = pre.next;
            location++;
        }
        return;
    }
    public void showList(){
        ListNode cur = head.next;
        while(cur!=null){
            System.out.println(cur);
            cur = cur.next;
        }
    }


    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(1);
        linkedList.showList();

        linkedList.addAtTail(3);
        linkedList.showList();

        System.out.println("**********");
        linkedList.addAtIndex(1,2);   //链表变为1-> 2-> 3
        linkedList.showList();
        System.out.println(linkedList.get(1));
        System.out.println("**********");

        linkedList.deleteAtIndex(1);  //现在链表是1-> 3
        linkedList.showList();

        System.out.println(linkedList.get(1));
    }
}


/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */