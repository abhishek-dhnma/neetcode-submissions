class Solution {


    public void solve(int[] nums, int i, List<Integer> list, int target,List<List<Integer>>  ans ){
        
        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }


        if(i == nums.length || target < 0){
            return;
        }

        // pick

        if(nums[i] <= target){
            list.add(nums[i]);
            solve(nums, i, list, target - nums[i], ans);
            list.removeLast();
        }

        // don't pick

        solve(nums, i+1, list, target, ans);


    }


    public List<List<Integer>> combinationSum(int[] nums, int target) {

        Arrays.sort(nums);
        List<List<Integer>>  ans  = new ArrayList<>();

        solve(nums, 0 , new ArrayList<>(), target, ans);
        return ans;
        
    }
}
