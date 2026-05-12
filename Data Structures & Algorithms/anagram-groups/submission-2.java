class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ans = new ArrayList<>();

        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){

            char[] arr = s.toCharArray();

            Arrays.sort(arr);

            String key = new String(arr);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);

        }

        
        // for(Map.Entry<String, List<String>> entry : map.entrySet() ){
        //     List<String> templist = entry.getValue();
        //     ans.add(templist);
        // }

        for(List<String> value : map.values()){
            ans.add(value);
        }
        


        // n * k log k + n 



        return ans;
        
    }
}
