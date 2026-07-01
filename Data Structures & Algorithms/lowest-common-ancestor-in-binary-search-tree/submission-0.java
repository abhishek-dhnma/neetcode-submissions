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

    
    public TreeNode DFS(TreeNode root, TreeNode p, TreeNode q){

        if(root == null) return root;

        if(p.val < root.val && q.val < root.val){
          return  DFS(root.left, p, q);
            
        }

        if(p.val > root.val && q.val > root.val){
           return DFS(root.right, p, q);
        }


            return root;

        

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

            

           return DFS(root, p, q);


    }
}
