class Solution {

    public int solve(int[] nums, int i, int[] dp){

       

        // base case
        if(i >= nums.length){
            return 0;
        }

         if(dp[i] != -1){
            return dp[i];
        }

        int take  =  nums[i] + solve(nums, i+2, dp);
        int donttake = solve(nums, i+1, dp);

        dp[i] = Math.max(take, donttake);

        return dp[i];

    }

    public int rob(int[] nums) {

        int n = nums.length;
        int[] dp = new int[n];   
        Arrays.fill(dp, -1); 
           
        return solve( nums, 0, dp);
        
    }
}
