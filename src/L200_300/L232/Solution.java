package L200_300.L232;

import java.util.Stack;

class MyQueue {

    private Stack<Integer> stackOne = new Stack<>();
    private Stack<Integer> stackTwo = new Stack<>();
    /** Initialize your data structure here. */
    public MyQueue() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stackOne.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while(!stackOne.isEmpty()){
            stackTwo.push(stackOne.pop());
        }
        int temp = stackTwo.pop();
        while(!stackTwo.isEmpty()){
            stackOne.push(stackTwo.pop());
        }
        return temp;
    }

    /** Get the front element. */
    public int peek() {
        while(!stackOne.isEmpty()){
            stackTwo.push(stackOne.pop());
        }
        int temp = stackTwo.peek();
        while(!stackTwo.isEmpty()){
            stackOne.push(stackTwo.pop());
        }
        return temp;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stackOne.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.empty());
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
