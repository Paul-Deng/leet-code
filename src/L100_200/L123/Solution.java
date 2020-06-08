package L100_200.L123;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: L100_200.L123
 * @Author: PaulDeng
 * @CreateTime: 2020-05-21 15:31
 */
public class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length  == 0) {
            return 0;
        }
        int[][][] dp = new int[prices.length][3][2];
        //base case dp[0][0][0] = 0;
        dp[0][0][0] = 0;
        dp[0][0][1] = Integer.MIN_VALUE;
        dp[0][1][0] = 0;
        dp[0][1][1] = -prices[0];
        dp[0][2][0] = 0;
        dp[0][2][1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            for (int k = 1; k <= 2; k++) {
                dp[i][k][0] = Math.max(dp[i - 1][k][0],dp[i - 1][k][1] + prices[i]);
                dp[i][k][1] = Math.max(dp[i - 1][k][1],dp[i - 1][k - 1][0] - prices[i]);
            }
        }
        return dp[prices.length - 1][2][0];
    }
}
