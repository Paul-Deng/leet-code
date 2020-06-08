package L100_200.L188;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: L100_200.L188
 * @Author: PaulDeng
 * @CreateTime: 2020-05-24 18:21
 */
class Solution {
    public int maxProfit(int k, int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        if( k > prices.length /2) {
            k = prices.length / 2 + 1;
        }
        int[][][] dp = new int[prices.length][k+1][2];

        dp[0][0][0] = 0;
        dp[0][0][1] = Integer.MIN_VALUE;
        for (int i = 1; i <= k; i++) {
            dp[0][i][0] = 0;
            dp[0][i][1] = -prices[0];
        }
        for (int i = 1; i < prices.length; i++) {
            for (int j = 1; j <= k; j++) {
                dp[i][j][0] = Math.max(dp[i - 1][j][0], dp[i - 1][j][1] + prices[i]);
                dp[i][j][1] = Math.max(dp[i - 1][j][1], dp[i - 1][j - 1][0] - prices[i]);
            }
        }
        return dp[prices.length - 1][k][0];
    }
}