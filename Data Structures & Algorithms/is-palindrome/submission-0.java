class Solution {
    public boolean isPalindrome(String s) {
      StringBuilder str = new StringBuilder();
      for(int i = 0 ; i<s.length();i++){
        char c= s.charAt(i);
        if(Character.isLetterOrDigit(c)){
            str.append(Character.toLowerCase(c));
        }

      }
      
      
        int p = 0 ; int j = str.length()-1;

        while(p<j){
            if(str.charAt(p) != str.charAt(j)){
                return false;
            }
            p++;
            j--;
        }
        return true;
    }
}
