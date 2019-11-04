package L700_800.L739;

import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] T) {
        Stack<Integer> stack = new Stack<>();
        int[] list = new int[T.length];
        for (int i = 0; i < T.length - 1; i++) {
            stack.push(T[i]);
            if(T[i+1] > T[i]){
            }
        }
        return new int[11];
    }
}
