package Offer.Offer_055;

import L100_200.L104.TreeNode;

//package Offer.Offer_055;
//
//import L100_200.L104.TreeNode;
//
///**
// * Definition for a binary tree node.
// * public class TreeNode {
// *     int val;
// *     TreeNode left;
// *     TreeNode right;
// *     TreeNode(int x) { val = x; }
// * }
// */
class Solution {
    public int maxDepth(TreeNode root) {
        return Height(root);
    }

    public int Height(TreeNode node){
        if(node == null){
            return 0;
        }
        return Math.max(Height(node.left),Height(node.right))+1;
    }
}