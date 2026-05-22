class Solution {



    static int binarysearch(int[] nums, int i, int j, int target){
        

        while(i <= j){
            int mid = i + (j-i)/2;

            if(nums[mid] == target){
                return mid;
                
            }else if(nums[mid] > target){
                j = mid-1;
            }else{
                i = mid +1;
            }
        }

        return -1;

    }


    static int findMinimumElement(int[] nums){

        int n = nums.length;
        int r = n-1;
        int l = 0;

        while(l < r){

            int mid = l + (r-l)/2;

            if(nums[mid] < nums[r]){
                r = mid;
            }else{
                l = mid+1; 

            }

        }

        return l;

    }



    public int search(int[] nums, int target) {

        // approach 
        // find minimum element and we have two sorted array 0-pivot-1 and pivot+1 - n-1 
        // check on these two sorted array its normal binary search 

        int n = nums.length;
        int minimumIndex = findMinimumElement(nums);

        if(nums[minimumIndex] == target){
            return minimumIndex;
        }

        int index = -1;
        index = binarysearch(nums, 0, minimumIndex-1, target);
        if(index != -1) return index;

        index = binarysearch(nums,minimumIndex+1, n-1, target);

        return index;

    }
}
