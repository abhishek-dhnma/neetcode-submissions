class Solution {
    public int lengthOfLongestSubstring(String s) {

        // sliding Window 

    
        int i=0;
        int j=0;
        int n = s.length();

        //HashMap<Character, Integer> map = new HashMap<>();
        int[] freqMap = new int[256];
        int ansMax = 0;

        while(j<n){

            // not present
            if(freqMap[s.charAt(j)] == 0){
                freqMap[s.charAt(j)]++;
                ansMax = Math.max(ansMax, j-i+1);
                j++;
            }else{
                // present
                freqMap[s.charAt(i)] = 0;
                i++;
            }


        }

        return ansMax;
        
    }
}
