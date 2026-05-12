class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> freqMap = new HashMap<>();

        for(char ch : s.toCharArray()){
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1 );
        }

        for(char tch : t.toCharArray()){
            freqMap.put(tch, freqMap.getOrDefault(tch, 0) - 1);
        }

        for(int count : freqMap.values()){
            if(count != 0){
                return false;
            }
        }


        return true;





    }
}
