class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int [] dp = new int [n+1];
         Arrays.fill(dp, -1);
        return recurse(nums ,  n-1 , dp);
    }

    private int recurse(int [] nums , int i , int [] dp ){
        if(i<0) return 0 ; 

        if(dp[i]>=0) return dp[i];

        int result = Math.max(recurse(nums , i-2 , dp) +nums[i] , recurse(nums ,i-1, dp));
        dp[i] = result ;

        return result;
    }
}
