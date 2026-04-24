class Solution {
    public int characterReplacement(String s, int k) {
        int [] freq = new int [26];

        int left = 0; 
         int max = 0 ;
        int maxfreq = 0 ; 
        int windowSize = 0 ; 

        for (int i = 0 ; i < s.length();i++){
            freq[s.charAt(i)-'A']++;

            maxfreq = Math.max(maxfreq , freq[s.charAt(i) - 'A']);

            windowSize = i-left + 1;

            if(windowSize-maxfreq>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }

            windowSize = i- left  + 1;
             max = Math.max(windowSize, max);
        }
        return max;

    }
}
