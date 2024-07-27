class Solution
{
    public int LongestRepeatingSubsequence(String str)
    {
        int n = str.length();
        int[][] dp = new int[n + 1][n + 1];

        // Building the dp table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // If characters match and the indices are not the same
                if (str.charAt(i - 1) == str.charAt(j - 1) && i != j) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[n][n];
    }
}