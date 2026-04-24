class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length()>s2.length()) return false;
        int [] freq = new int [26];

        for(int i = 0 ; i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;

           
        }
         if(match(freq)) return true;

        for(int i = s1.length();i<s2.length();i++){
            freq[s2.charAt(i)-'a']--;
            freq[s2.charAt(i-s1.length())-'a']++;
            if(match(freq)) return true;
        }
        
        return false;
    }

    private boolean match (int [] freq){
        for(int i = 0;i<26;i++){
            if(freq[i]!=0){
                return false;
            }
            
        }
        return true;
    }
}
