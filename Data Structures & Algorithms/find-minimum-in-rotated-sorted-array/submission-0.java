class Solution {
    public int findMin(int[] nums) {

        int n = nums.length;
        if(nums[0] < nums[n-1]) return nums[0];

        int l = 0;
        int r = n-1;

        while(l < r){

            int mid = l +  (r - l)/2;

            if(nums[mid] > nums[r] ){
                l = mid + 1;
            }else if ( nums[mid] <= nums[r]){
                r = mid;
            }
             

        }

        return nums[l];
        
    }
}
