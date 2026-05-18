class Solution {
    public int lengthOfLongestSubstring(String s) {

        /*
         * APPROACH: Sliding Window + HashMap (index jumping)
         *
         * Key Insight: store last seen index of each character.
         * When duplicate found, jump i directly to duplicate_index + 1
         * instead of crawling i forward one step at a time.
         *
         * Math.max(i, ...) ensures i never moves backwards —
         * guards against duplicates that were last seen BEFORE the current window.
         * Example: "abba" — when j hits 'a' at index 3, map has 'a' at index 0
         * which is outside the current window [2,3]. Without Math.max, i
         * would jump back to 1, corrupting the window.
         *
         * TC: O(n)     — single pass, each character processed once
         * SC: O(n)     — HashMap grows with unique characters (max 256 for ASCII)
         *
         * vs int[256] sliding window: same TC/SC in practice but HashMap
         * handles unicode; int[256] is faster due to no boxing overhead.
         */

        int i = 0;
        int j = 0;
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>(); // char -> last seen index
        int ansMax = 0;

        while(j < n){

            if(map.containsKey(s.charAt(j))){
                // duplicate found — jump i past the previous occurrence
                // Math.max ensures i never moves backwards (stale index guard)
                i = Math.max(i, map.get(s.charAt(j)) + 1);
            }

            map.put(s.charAt(j), j);              // always update to latest index
            ansMax = Math.max(ansMax, j - i + 1); // window size = j - i + 1
            j++;                                   // expand window
        }

        return ansMax;
    }
}