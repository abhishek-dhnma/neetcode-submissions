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

        while(root != null){

        if(p.val < root.val && q.val < root.val){
          return  DFS(root.left, p, q);
            
        }

        else if(p.val > root.val && q.val > root.val){
           return DFS(root.right, p, q);
        }

else
            return root;

        
        }

        return root;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

            

           return DFS(root, p, q);


    }
}
