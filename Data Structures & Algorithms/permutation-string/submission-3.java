class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int n = s1.length();
        int m = s2.length();

        if(n > m) return false;

        Map<Character, Integer> freq1 = new HashMap<>();
        Map<Character, Integer> freq2 = new HashMap<>();
        

        for(int i=0; i<n; i++){
            Character ch = s1.charAt(i);
            freq1.put(ch, freq1.getOrDefault(ch, 0) + 1);
        }

        
        int i=0;
        int j=0;

        while(j < m){
                Character ch = s2.charAt(j);
                freq2.put(ch, freq2.getOrDefault(ch, 0) + 1);

                // shrink
                if(j-i+1 > n){
                    Character cc = s2.charAt(i);
                    freq2.put(cc, freq2.getOrDefault(cc, 0) - 1);
                    if(freq2.get(cc) <=0){
                        freq2.remove(cc);
                    }
                    i++;
                }
                

                if( freq1.equals(freq2)){
                    return true;
                }

                j++;
        }

        return false;



        
    }
}
