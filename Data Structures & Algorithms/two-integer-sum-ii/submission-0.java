class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int n = numbers.length;

        int i=0;
        int j=n-1;
        int sum;

        int[] ans = new int[2];

        while(i<j){

            if(numbers[i] == numbers[j]){
                i++;
                j--;
                continue;
            }

            sum = numbers[i] + numbers[j];

            if(sum == target){
                ans[0] = i + 1;
                ans[1] = j + 1;
                break;
            }

            if(sum > target){
                j--;
            }else{
                i++;
            }


            
        }

        return ans;
        
    }
}
