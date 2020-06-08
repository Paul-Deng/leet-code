package Offer.Offer04.Offer02;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: Offer.Offer04.Offer02
 * @Author: PaulDeng
 * @CreateTime: 2020-05-27 19:03
 */

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

//1. recursion
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return getBST(nums,0, nums.length - 1);
    }

    private TreeNode getBST(int[] nums, int left, int right) {
        //terminator
        if (left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        //process
        TreeNode node = new TreeNode(nums[mid]);
        node.left = getBST(nums, left,mid - 1);
        node.right = getBST(nums,mid + 1, right);
        return node;
    }
}
