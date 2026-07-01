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
    
    TreeNode froot1 = null;
    public void find1(TreeNode root, TreeNode subRoot){

        if(root == null || subRoot == null || froot1 != null) return;

        if(root.val == subRoot.val) {
            froot1 = root;
            return;
        }

        find1(root.left, subRoot);
        find1(root.right, subRoot);
    }

    public TreeNode find2(TreeNode root, TreeNode subRoot){
        
        if(root == null || subRoot == null) return null;

        if(root.val == subRoot.val) return root;

        TreeNode froot = null;
        froot = find2(root.left, subRoot);
        if(froot != null){
            return froot;
        }

        froot = find2(root.right, subRoot);

        return froot;


    }

    public boolean isSameTree(TreeNode root, TreeNode subRoot){

        if(root == null && subRoot == null) return true; // both are null

        if(root != null && subRoot == null) return false; // one is null and other not
        if(root == null && subRoot !=  null) return false;

        return (root.val == subRoot.val) && isSameTree(root.right, subRoot.right) && isSameTree(root.left, subRoot.left);

    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

       if(root == null) return false;


       if(root.val == subRoot.val){
            if(isSameTree(root, subRoot)) return true;
       }

       return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);


    }
}
