class Solution {
    public int lengthOfLongestSubstring(String s) {

        // sliding Window 

    
        int i=0;
        int j=0;
        int n = s.length();

        HashMap<Character, Integer> map = new HashMap<>();
        int ansMax = 0;

        while(j<n){

            // not present
            if(!map.containsKey(s.charAt(j))){
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
                ansMax = Math.max(ansMax, j-i+1);
                j++;
            }else{
                // present
                map.remove(s.charAt(i));
                i++;
            }


        }

        return ansMax;
        
    }
}
