package L900_L1000.L965;

import L100_200.L104.TreeNode;

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

    public int val;
    public boolean flag = true;
    public boolean isUnivalTree(TreeNode root) {
        val = root.val;
        LDR(root);
        return flag;
    }
    public void LDR(TreeNode node){
        if(node.left != null){
            LDR(node.left);
        }
        if(val != node.val){
            flag = false;
        }
        if(node.right != null){
            LDR(node.right);
        }
    }

    public static void main(String[] args) {

    }
}