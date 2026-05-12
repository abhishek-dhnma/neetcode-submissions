class Solution {
    public boolean isAnagram(String x, String y) {

        int[] arr = new int[26];

        String s,t;

        if(x.length() <= y.length()){
            s = x;
            t = y;
        }else{
            s = y;
            t = x;
        }

        for(int i=0; i<s.length(); i++){
            arr[ s.charAt(i) - 'a']++;
        }

        for(int i=0; i<t.length(); i++){

            
            if(arr[t.charAt(i) - 'a'] <= 0){
                return false;
            }

            else if (arr[t.charAt(i) - 'a'] != 0){
                arr[t.charAt(i) - 'a']--;
            } 

        }




        return true;

    }
}
