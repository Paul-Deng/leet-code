package L700_800.L700;

import L100_200.L104.TreeNode;

public class Solution1 {
    public static TreeNode searchBST(TreeNode root, int val) {
        TreeNode treeNode = binaryFind(root, val);
        return treeNode;
    }

    public static TreeNode binaryFind(TreeNode root, int val){
        TreeNode node = null;
        if(val > root.val){
            if(root.right != null){
                node = binaryFind(root.right, val);
            }else{
                return null;
            }
        }else if (val < root.val){
            if(root.left != null){
                node = binaryFind(root.left, val);
            }else{
                return null;
            }
        }else{
            node = root;
        }
        return node;
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
