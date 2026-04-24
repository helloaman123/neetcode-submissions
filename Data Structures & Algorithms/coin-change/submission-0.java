class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        
        // dp[i][j] = minimum coins to make amount j using first i coins
        int [][] dp = new int[n + 1][amount + 1];

        // Initialize: with 0 coins, impossible to make positive amounts
        for (int j = 1; j <= amount; j++) {
            dp[0][j] = amount + 1; // treat as "infinity"
        }

        // Fill DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= amount; j++) {
                // Case 1: don't use coin i
                dp[i][j] = dp[i - 1][j];

                // Case 2: use coin i (if possible)
                if (coins[i - 1] <= j) {
                    dp[i][j] = Math.min(dp[i][j], 1 + dp[i][j - coins[i - 1]]);
                }
            }
        }

        return dp[n][amount] > amount ? -1 : dp[n][amount];
    }
}
