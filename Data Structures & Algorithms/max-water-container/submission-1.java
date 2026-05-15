class Solution {
    public int maxArea(int[] heights) {

        // two pointer approach -what we are doing previously something like finding all pair and find max from all which is O(N^2) solutionn
        // and slow

        int i=0; 
        int j=heights.length-1;
        int maxArea = 0;
        
        while(i < j){

          int currArea = Math.min(heights[i], heights[j]) * (j-i);

           maxArea = Math.max(maxArea, currArea);

           if(heights[i] > heights[j]){
            j--;
           }else{
            i++;
           }


        }

        return maxArea;
        
    }
}
