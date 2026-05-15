class Solution {
    public int longestConsecutive(int[] nums) {

        // optimal approach 
        int n = nums.length;
        if(n == 0) return 0;

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) set.add(num);

        int ans = 0;       

       for( int i=0; i<n; i++){
        // previous not present in set - start from there
        int currcount = 1;
        
        if(!set.contains(nums[i] - 1)){
            
            int currval = nums[i];
            while(set.contains(currval+1)){
                currcount++;
                currval++;

            }

            
                
        }

        ans = Math.max(ans, currcount);

       }

        return ans;
    }
}
