package L300_L400.L337;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: L300_L400.L337
 * @Author: PaulDeng
 * @CreateTime: 2020-05-24 11:07
 */

import L100_200.L104.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//way one : DP
//class Solution {
//    Map<TreeNode,Integer> memo = new HashMap<>();
//    public int rob(TreeNode root) {
//        if (root == null) {
//           return 0;
//        }
//        if (memo.containsKey(root)) {
//            return memo.get(root);
//        }
//
//        // rob this root
//        int robVal = root.val + (root.left == null ? 0 : rob(root.left.left) + rob(root.left.right)) +
//                ((root.right == null ? 0 : rob(root.right.left) + rob(root.right.right)));
//        int noRobVal = rob(root.left) + rob(root.right);
//
//        int maxVal = Math.max(robVal,noRobVal);
//        memo.put(root,maxVal);
//        return memo.get(root);
//    }
//}

// way two : DP
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int[] result = robInterval(root);
        return Math.max(result[0],result[1]);
    }

    private int[] robInterval(TreeNode root) {
        if (root == null) {
            return new int[2];
        }
        int[] left = robInterval(root.left);
        int[] right = robInterval(root.right);

        int robVal = root.val + left[0] + right[0];
        int noRobVal = Math.max(left[0],left[1]) + Math.max(right[0], right[1]);

        return new int[]{noRobVal,robVal};
    }
}