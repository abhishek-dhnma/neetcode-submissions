class Solution {


    public int isRob(int[] nums, int i, int j, int[] dp){

        if(i > j){
            return 0;
        }

        if(dp[i] != -1){
            return dp[i];
        }


        int take = nums[i] + isRob(nums, i+2, j, dp);
        int nottake = isRob(nums, i+1, j, dp);

        return dp[i] = Math.max(take, nottake);

    }
    public int rob(int[] nums) {

        int n = nums.length;

        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0], nums[1]);

        int[] dp =  new int[n+1];
        Arrays.fill(dp, -1);
        int include = isRob(nums, 0, n-2, dp); // if first house choosen then you can't choose last house
        Arrays.fill(dp, -1);
        int exclude = isRob(nums, 1, n-1, dp); // if first house not choosen then we can choose last house

        return Math.max(include, exclude);
        
    }
}
