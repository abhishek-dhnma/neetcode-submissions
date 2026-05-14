class Solution {

    public String encode(List<String> strs) {
    
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<strs.size(); i++){
            sb.append(strs.get(i).length()).append('#').append(strs.get(i));
        }

        return sb.toString();
    }


    // "5#hello5#world"

    public List<String> decode(String str) {
        int i=0;
        int n = str.length();
        List<String> ans = new ArrayList<>();

        while(i<n){

            int len = 0;

            while(str.charAt(i) != '#'){
                len = len * 10 + (str.charAt(i) - '0');
                i++;
            }

            i++; // skip #

            String s = str.substring(i, len + i );
            ans.add(s);

            i+= len;

        }

        return ans;



    }
}
