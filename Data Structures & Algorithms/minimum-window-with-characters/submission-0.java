class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character , Integer> count = new HashMap<>();
        HashMap<Character , Integer> total = new HashMap<>();

        int [] res = new int []{-1,1};
        int need = 0 ; 
        int have = 0 ; 


        for(char c : t.toCharArray()){
            count.put(c,count.getOrDefault(c,0)+1);
        }

        need = count.size();
        int resLen = Integer.MAX_VALUE;
        int l = 0 ; 

        for(int r= 0 ; r<s.length();r++){

            char c = s.charAt(r);
            total.put(c, total.getOrDefault(c,0)+1);

            if(count.containsKey(c) && total.get(c).equals(count.get(c))){
                have++;
            }

            while(have==need){
                if((r-l+1)<resLen){
                    resLen = r-l+1;
                    res[0] = l ; 
                    res[1] = r;
                }
                char leftChar = s.charAt(l);
                total.put(leftChar, total.get(leftChar)-1);
                if(count.containsKey(leftChar)&& total.get(leftChar)<count.get(leftChar)){
                    have--;
                }
                l++;
            }
        }

        return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0],res[1]+1);
    }
}
