class Solution {
    public boolean isPalindrome(String s) {

        int i=0;
        int j=s.length()-1;

        while(i <= j){

            // space and non-alphanumeric removing
            while(i<=j && (s.charAt(i) == ' ' || !Character.isLetterOrDigit(s.charAt(i)))) i++;
            while(i<=j && (s.charAt(j) == ' ' || !Character.isLetterOrDigit(s.charAt(j)))) j--;



            if(i<=j && Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }

            
            i++;
            j--;


        }


        return true;
        
    }
}
