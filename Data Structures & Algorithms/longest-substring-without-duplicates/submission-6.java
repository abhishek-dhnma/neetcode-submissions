class Solution {
    public int lengthOfLongestSubstring(String s) {

        // sliding Window 

    
        int i=0;
        int j=0;
        int n = s.length();

        HashMap<Character, Integer> map = new HashMap<>();
    
        int ansMax = 0;

        while(j<n){

            if(map.containsKey(s.charAt(j))){
                
                i = Math.max(i, map.get(s.charAt(j)) + 1);
            }
         
            map.put(s.charAt(j), j);
            ansMax = Math.max(ansMax, j-i+1);
            j++;
        }

        return ansMax;
    }
}
