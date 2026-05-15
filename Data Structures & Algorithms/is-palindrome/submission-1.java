class Solution {
    public boolean isPalindrome(String s) {

        // APPROACH: Clean then Two Pointer
        // TC: O(n)  SC: O(n) — extra space for StringBuilder and cleaned string
        // Trade-off: simpler to read but uses extra space
        // Optimal approach: two pointers directly on s, skip non-alphanumeric on the fly → SC: O(1)

        // Step 1: filter only alphanumeric chars and lowercase them
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch))
                sb.append(Character.toLowerCase(ch));
        }

        // Step 2: two pointer check on cleaned string
        String news = sb.toString();
        int i = 0;
        int j = news.length() - 1;

        while(i <= j){
            if(news.charAt(i) == news.charAt(j)){
                i++;
                j--;
            } else {
                return false; // mismatch found
            }
        }

        return true; // all characters matched
    }
}