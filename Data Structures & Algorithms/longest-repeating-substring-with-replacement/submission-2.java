class Solution {
    public int characterReplacement(String s, int k) {

        int i =0;
        int j=0;
        int n = s.length();

        int maxFreq = 0;
        int[] freq = new int[26];

        while(j<n){

            freq[s.charAt(j) - 'A']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(j) - 'A'] );

            if(((j-i+1)  -  maxFreq) > k){
                freq[s.charAt(i)-'A']--;
                i++;
            }

            j++;
            

        }

        return n-i;
        
    }
}
