class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];

        for(int i=0; i<nums.length; i++){
            Integer compliment = target - nums[i];
            // check
            if(map.containsKey(compliment)){
                ans[0] = map.get(compliment);
                ans[1] = i;
            }

            // insert
            map.put(nums[i], i);
        }

        return ans;
        
    }
}
