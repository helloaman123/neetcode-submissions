class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character , Integer> target = new HashMap<>();
        HashMap<Character , Integer> current = new HashMap<>();


        for(char c : t.toCharArray()){
            target.put(c,target.getOrDefault(c,0)+1);
        }

        int have = 0 ; int need = target.size();

        int [] res ={-1,-1};
        int resLen = Integer.MAX_VALUE;
        int l = 0 ; 

        for(int r = 0 ; r< s.length();r++){
            char c= s.charAt(r);

            current.put(c, current.getOrDefault(c,0)+1);

            if(target.containsKey(c) && current.get(c).equals(target.get(c))){
                have++;
            }

            while(have==need){
                if(r-l+1<resLen){
                    resLen = r-l+1;
                    res[0] = l ;
                    res[1] = r;
                } 

                char leftChar = s.charAt(l);
                current.put(leftChar , current.get(leftChar)-1);
                if(target.containsKey(leftChar) && current.get(leftChar)<
                target.get(leftChar)){
                    have--;
                }
                l++;
            }

        }
        return resLen ==Integer.MAX_VALUE ? "" : s.substring(res[0] , res[1] +1);
    }
}
