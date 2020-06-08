package L100_200.L121;

//class Solution {
//    public int maxProfit(int[] prices) {
//        int real_max = 0;
//        for (int i = 0; i < prices.length - 1; i++) {
//            for (int j = i + 1; j < prices.length; j++) {
//                if(prices[j] - prices[i] < 0){
//                    break;
//                }else if (prices[j] - prices[i] > real_max){
//                    real_max = prices[j] - prices[i];
//                }
//            }
//        }
//        return real_max;
//    }
//}
// way two: dp
class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        //represent the day buy and day sell
        int[][] dp = new int[prices.length][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(- prices[i] ,dp[i - 1][1]);
        }
        return dp[prices.length - 1][0];
    }
}