package L600_L700.L617;

import L100_200.L104.TreeNode;
import sun.reflect.generics.tree.Tree;

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
    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode root = new TreeNode(-1);
        merge(t1,t2,root);
        return root;
    }
    public static void merge(TreeNode node1,TreeNode node2,TreeNode node){
        if(node1 != null && node2 !=null){
            node.val = node1.val + node2.val;
        }else if(node2 == null){
            node.val = node1.val;
        }else if(node1 == null){
            node.val = node2.val;
        }

        if(node1.left == null && node2.left == null){
            return;
        }else{
            TreeNode left = new TreeNode(-1);
            node.left = left;
            merge(node1.left,node2.left,node.left);
        }

        if(node1.right == null && node2.right == null){
            return;
        }else{
            TreeNode right = new TreeNode(-1);
            node.right = right;
            merge(node1.right,node2.right,node.right);
        }
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node31 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node7 = new TreeNode(7);
        t1.right = node2;
        t1.left = node3;
        node3.left = node5;


        t2.right = node31;
        t2.left = node1;
        node1.right = node4;
        node31.right = node7;

        TreeNode treeNode = mergeTrees(t1, t2);
        System.out.println(treeNode);
    }
}