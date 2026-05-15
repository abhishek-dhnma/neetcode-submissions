class Solution {
    public int longestConsecutive(int[] nums) {

        // APPROACH: Sorting
        // Sort array then scan linearly
        // - consecutive → extend current streak
        // - duplicate   → skip (neither condition triggers)
        // - gap         → reset current streak
        // TC: O(n log n)  SC: O(1)

        int n = nums.length;
        if(n == 0) return 0;

        Arrays.sort(nums);
        int globalans = 0;
        int currcount = 1;
        int i = 0;

        while(i < n){
            if(i < n-1 && nums[i] + 1 == nums[i+1]){
                currcount++;                          // consecutive
            } else if(i < n-1 && nums[i+1] > nums[i] + 1){
                currcount = 1;                        // gap, reset
            }
            // duplicate: do nothing, i++ moves forward naturally

            globalans = Math.max(currcount, globalans);
            i++;
        }

        return globalans;
    }
}