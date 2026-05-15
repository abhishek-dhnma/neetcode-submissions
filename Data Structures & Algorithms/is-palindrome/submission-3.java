class Solution {
    public boolean isPalindrome(String s) {

        // APPROACH: Two Pointer directly on original string
        // Skip non-alphanumeric characters on the fly — no extra space needed
        // TC: O(n)  SC: O(1)

        int i = 0;
        int j = s.length() - 1;

        while(i <= j){

            // skip non-alphanumeric from left
            while(i <= j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            // skip non-alphanumeric from right
            while(i <= j && !Character.isLetterOrDigit(s.charAt(j))) j--;

            // compare case-insensitive
            if(i <= j && Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false; // mismatch found
            }

            i++;
            j--;
        }

        return true; // all alphanumeric characters matched
    }
}