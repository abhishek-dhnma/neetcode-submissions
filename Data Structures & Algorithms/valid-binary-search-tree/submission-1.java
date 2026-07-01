/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {

    public boolean validtree(TreeNode root, long minn, long maxx){

        if(root == null) return true;


        boolean nodeStatus = (root.val > minn && root.val < maxx);


        return nodeStatus && validtree(root.left, minn, root.val) && validtree(root.right, root.val, maxx);
    }


    public boolean isValidBST(TreeNode root) {

        if(root == null) return true;

        return validtree(root,  Long.MIN_VALUE, Long.MAX_VALUE);
       


    }
}
