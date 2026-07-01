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
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if(root == null) return ans;

        Queue<TreeNode> que = new ArrayDeque<>();
        que.offer(root);


        while(!que.isEmpty()){

            int currSize = que.size();

            List<Integer> tempList = new ArrayList<>();


            for(int i=currSize; i>0; i--){

                TreeNode front = que.poll();

                tempList.add(front.val);

                if(front.left != null) que.offer(front.left);
                if(front.right != null) que.offer(front.right);



            }

            ans.add(tempList);




        }

        return ans;

        
    }
}
