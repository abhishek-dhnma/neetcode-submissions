class Solution {
    public int lengthOfLongestSubstring(String s) {

        // Brute force 
        // using two for loop i and j
        int n = s.length();
        if(n == 1) return 1;
        int maxAns = 0;
        for(int i=0; i<n; i++){
            int[] arr = new int[256];
            int count = 0;
            for(int j=i; j<n; j++){
                arr[s.charAt(j) ]++;
                if(arr[s.charAt(j) ] <=1){
                    count++;
                }else{
                    break;
                }
            }
            maxAns = Math.max(maxAns, count);
        }

        return maxAns;
        
    }
}
