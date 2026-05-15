class Solution {
    public int longestConsecutive(int[] nums) {


        int n = nums.length;
        if(n == 0) return 0;

        // O(n) — add all elements for O(1) lookup
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);

        int ans = 0;

        for(int i = 0; i < n; i++){

            // only process sequence starts — discard if left neighbor exists
            // left neighbor means this element is already part of an earlier sequence
            if(!set.contains(nums[i] - 1)){

                int currval = nums[i];
                int currcount = 1;

                // extend sequence as far right as possible
                while(set.contains(currval + 1)){
                    currcount++;
                    currval++;
                }

                ans = Math.max(ans, currcount);
            }
        }

        return ans;

        
        /*
         * APPROACH: HashSet + Sequence Start Detection
         *
         * Key Insight: only start counting from a number where (num-1) is NOT in set.
         * This guarantees we only process each sequence once from its true starting point.
         *
         * Why O(n) and not O(n²):
         * The while loop looks nested but each element is visited at most TWICE —
         * once in the outer for loop, and at most once inside a while loop.
         * Elements that are NOT sequence starts are discarded in O(1).
         * Elements that ARE sequence starts trigger the while loop, but that
         * while loop only runs for elements in that sequence — never revisited again.
         *
         * Example: [1,2,3,4,5]
         * - 1 has no left neighbor → start here, while loop runs 4 times (2,3,4,5)
         * - 2,3,4,5 each have left neighbor → discarded in O(1)
         * Total operations = n (outer) + n (inner across all sequences) = O(2n) = O(n)
         *
         * TC: O(n)  — each element touched at most twice
         * SC: O(n)  — HashSet stores all elements
         */
    }
}