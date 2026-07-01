class Solution {
List<List<Integer>>  ans  = new ArrayList<>();

    public void solve(int[] nums, int currsum, int start, List<Integer> list, int target){
        
        if(currsum > target) return;

        if(currsum == target) {
            ans.add(new ArrayList<>(list));
            return;
        }


        for(int i = start; i < nums.length; i++ ){

            if((currsum + nums[i]) > target ) break;

            list.add(nums[i]);
            solve(nums, currsum + nums[i], i, list, target);
            list.removeLast();

        }


    }


    public List<List<Integer>> combinationSum(int[] nums, int target) {

        Arrays.sort(nums);

        List<Integer> templist = new ArrayList<>(); 

        solve(nums, 0 , 0, templist, target);
        return ans;
        
    }
}
