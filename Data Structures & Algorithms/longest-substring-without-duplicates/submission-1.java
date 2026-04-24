class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> s1 = new HashSet<>();

        int l = 0 ; 
        int res = 0 ; 


        for(int r= 0 ; r< s.length();r++){
            while(s1.contains(s.charAt(r))){
                s1.remove(s.charAt(l));
                l++;
            }

            s1.add(s.charAt(r));

            res = Math.max(res , r-l+1);
        }

        return res;
    }
}
