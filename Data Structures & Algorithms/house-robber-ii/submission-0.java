class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];

        // Case 1: Exclude last house
        int case1 = robLinear(Arrays.copyOfRange(nums, 0, n-1));
        // Case 2: Exclude first house
        int case2 = robLinear(Arrays.copyOfRange(nums, 1, n));

        return Math.max(case1, case2);
    }

    private int robLinear(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = nums[0];

        for (int i = 2; i <= n; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i-1]);
        }
        return dp[n];
    }
}
