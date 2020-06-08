package L100_200.L104;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//class Solution {
//    public int maxDepth(TreeNode root) {
//        //terminal
//        if(root == null){
//            return 0;
//        }
//        return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
//    }
//}

//class Solution {
//    public int maxDepth(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//        LinkedList<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//        int count = 0;
//        while (!queue.isEmpty()) {
//            count ++;
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                TreeNode pop = queue.pop();
//                if (pop.left != null) {
//                    queue.add(pop.left);
//                }
//                if (pop.right != null) {
//                    queue.add(pop.right);
//                }
//            }
//        }
//        return count;
//    }
//}