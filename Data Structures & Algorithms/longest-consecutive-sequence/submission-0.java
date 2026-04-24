class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num:nums){
            set.add(num);

        }

        int longest = 0 ; 

        for(int s:set){
            if(!set.contains(s-1)){
                int length = 1;
                while(set.contains(s+length)){
                    length++;
                }

                longest = Math.max(length , longest);
            }
           
        }
        return longest;
    }
}
