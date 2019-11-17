package com.techbow.worksimulation.sensoriot.ingest.leetcode;

public class LC270 {
    public int closestValue(TreeNode root, double target) {
        if (root == null) return 0;
        int closest = root.val;
        while(root != null){
            if (target == root.val) return root.val;
            if(Math.abs(target - root.val) < Math.abs(target - closest)) {
                closest = root.val;
            }

            root = root.val > target ? root.left : root.right;
        }
        return closest;
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}


