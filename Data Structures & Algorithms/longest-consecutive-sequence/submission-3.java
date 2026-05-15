    class Solution {
        public int longestConsecutive(int[] nums) {

            // Brute Force 
            // Sorting - O(n log n) + iterate O(N) ~ O(n log n)

           
           
            int n = nums.length;
            if(n == 0) return 0;

             int globalans = 1;
             Arrays.sort(nums);
            int i = 0;
            int currcount = 1;
            while(i < n){
            
                if(i < n-1 && nums[i] + 1 == nums[i+1]){
                    currcount++;
                    
                }else if(i < n-1 && nums[i] == nums[i+1]){
                    
                }
                else {
                    currcount = 1;
                }

                globalans = Math.max(currcount, globalans);

                i++;
                
            }

            

            return globalans;

        }
    }
