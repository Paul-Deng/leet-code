package L100_200.L122;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: L100_200.L122
 * @Author: PaulDeng
 * @CreateTime: 2020-05-21 15:32
 */
//way one : online Array
//public class Solution {
//    public int maxProfit(int[] prices) {
//        int sum = 0;
//        for (int i = 0; i < prices.length - 1; i++) {
//            if(prices[i+1] - prices[i] > 0){
//                sum += prices[i+1] - prices[i];
//            }
//        }
//        return sum;
//    }
//}

//way two : DP
class Solution {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        //base case : dp[0][0] = 0; dp[0][1] = -prices[0]
        //dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i])
        //dp[i][1] = Math.max(dp[i - 1][0] - prices[i], dp[i -1][1])
        dp[0][0] = 0;
        dp[0][1] = - prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][0] - prices[i], dp[i -1][1]);
        }
        return dp[prices.length - 1][0];
    }
}