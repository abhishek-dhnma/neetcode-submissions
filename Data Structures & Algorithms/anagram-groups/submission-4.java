class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // optimal approach - using list of frequency as key in map
        // TC : O(N * M)
        HashMap<List<Integer>, List<String>> map = new HashMap<>();

        for(String s : strs){
            List<Integer> keyList = new ArrayList<>(Collections.nCopies(26,0));
            for(int i=0; i<s.length(); i++){

                int idx = s.charAt(i) - 'a';
                keyList.set(idx, keyList.get(idx) + 1);

            }

            map.computeIfAbsent(keyList, k -> new ArrayList<>()).add(s);

        }

        return new ArrayList<>(map.values());
        
    }
}
