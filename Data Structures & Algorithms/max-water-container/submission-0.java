class Solution {
    public int maxArea(int[] heights) {

        // brute force 

        int n = heights.length;
        int maxwater = 0;
        for(int i=0; i<n-1; i++){
            int currmax = 0;
            for(int j=i+1; j<n; j++){
              currmax = Math.min(heights[i], heights[j]) * (j-i);
              maxwater = Math.max(currmax, maxwater);
            }
        }

        return maxwater;
        
    }
}
