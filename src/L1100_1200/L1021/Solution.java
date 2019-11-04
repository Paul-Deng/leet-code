package L1100_1200.L1021;

import java.util.Stack;

class Solution {
    public static String removeOuterParentheses(String S) {
        char[] chars = S.toCharArray();
        String s = "";
        Stack<Character> leftstack = new Stack<>();
        Stack<Character> rightstack = new Stack<>();
        Stack<Character> stack = new Stack<>();
        if (chars.length == 0) {
            return "";
        } else {
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '(') {
                    if (rightstack.size() > 0) {
                        for (int j = 0; j < leftstack.size(); j++) {
                            s += String.valueOf(leftstack.pop());
                        }
                        while (!rightstack.isEmpty()) {
                            s += String.valueOf(rightstack.pop());
                        }
                    }
                        stack.push(chars[i]);
                    }else if (chars[i] == ')') {
                        char pop = stack.pop();
                        if (stack.isEmpty()) {
                            continue;
                        } else {
                            leftstack.push(pop);
                            rightstack.push(chars[i]);
                        }
                    }
                }
        }
            while (!leftstack.isEmpty()) {
                s += String.valueOf(leftstack.pop());
            }
            while (!rightstack.isEmpty()) {
                s += String.valueOf(rightstack.pop());
            }
            return s;
    }

    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("((()())(()()))"));

    }
}