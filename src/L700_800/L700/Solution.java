package L700_800.L700;

import L100_200.L104.TreeNode;

class Solution {


    public static TreeNode searchBST(TreeNode root, int val) {
        TreeNode search = search(root, val);
        return search;
    }

    public static TreeNode search(TreeNode root, int val){
        if(root.val == val){
            return root;
        }

        TreeNode result = null;

        if(root.left != null){
            result = searchBST(root.left,val);
        }
        if(result != null){
            return result;
        }

        if(root.right != null){
            result = searchBST(root.right,val);
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(7);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(3);
        root.right = node3;
        root.left = node2;
        node2.left = node4;
        node2.right = node5;

        TreeNode treeNode = searchBST(root,2);
        System.out.println(treeNode);
    }
}