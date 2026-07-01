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

    public int solution(TreeNode root){

        if(root == null) return 0;

        int r = 1 + solution(root.right);
        int l = 1 + solution(root.left);

        return Math.max(r,l);

    }

    public int maxDepth(TreeNode root){


        if(root == null) return 0;

        return solution(root);
     
        
    }
}