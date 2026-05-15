class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            sb.append(Character.toLowerCase(ch));
        }

        String news = sb.toString();

        System.out.println(sb);
        System.out.println(news);

        int i = 0;
        int j = news.length()-1;

        while(i <= j){

            if(news.charAt(i) == news.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }


        }

        return true;
        
    }
}
