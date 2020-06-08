package L000_100.L098;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: L000_100.L098
 * @Author: PaulDeng
 * @CreateTime: 2020-05-22 15:14
 */

import L100_200.L104.TreeNode;

import java.util.concurrent.locks.Lock;

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
    Integer pre = Integer.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        //terminal
        if (root == null) {
            return true;
        }
        //drill down
        if (!isValidBST(root.left)){
            return false;
        }
        if(pre > root.val){
            return false;
        }
        pre = root.val;
        return isValidBST(root.right);
    }
}