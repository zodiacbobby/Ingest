package com.techbow.worksimulation.sensoriot.ingest.leetcode;

//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class LC98 {

    private static TreeNode prev = null;
//     public static void main(String[] args) {
//
//         TreeNode root = new TreeNode(3);
//         root.left = new TreeNode(2);
//         root.right = new TreeNode(4);
//         boolean test = isValidBST(root);
//     }

    public static boolean isValidBST(TreeNode root) {

        return dfs(root);
    }

    private static boolean dfs(TreeNode root) {
        if (root == null) return true;

        if (!dfs(root.left)) return false;

        if (prev != null && prev.val >= root.val) {
            return false;
        }

        prev = root;
        return dfs(root.right);
    }
}

