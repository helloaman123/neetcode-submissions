class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int[] memo = new int[n];
        Arrays.fill(memo, -1);
        return dfs(s, 0, memo);
    }

    private int dfs(String s, int i, int[] memo) {
        if (i == s.length()) return 1; // reached end successfully
        if (s.charAt(i) == '0') return 0; // cannot decode '0'
        if (memo[i] != -1) return memo[i];

        // Decode one digit
        int ways = dfs(s, i + 1, memo);

        // Decode two digits if valid
        if (i + 1 < s.length()) {
            int twoDigit = Integer.parseInt(s.substring(i, i + 2));
            if (twoDigit >= 10 && twoDigit <= 26) {
                ways += dfs(s, i + 2, memo);
            }
        }

        memo[i] = ways;
        return ways;
    }
}
