class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int n : nums){
            set.add(n);
        }

        int longest = 0 ; 

        int length = 0 ; 

        for(int s:set){
            if(!set.contains(s-1)){
                length = 1 ;
                while(set.contains(s+length)){
                    length++;
                }
                
            }
            longest = Math.max(length , longest);
            
        }
        return longest;
    }
}
