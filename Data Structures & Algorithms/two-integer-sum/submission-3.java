class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];

        for(int i=0; i<nums.length; i++){
            int compliment = target - nums[i];
            // check
            if(map.containsKey(compliment)){
                return new int[]{map.get(compliment), i};
            }

            // insert
            map.put(nums[i], i);
        }

        return new int[] {};
        
    }
}
