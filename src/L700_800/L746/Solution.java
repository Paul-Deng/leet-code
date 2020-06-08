package L700_800.L746;

import java.util.Arrays;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: L700_800.L746
 * @Author: PaulDeng
 * @CreateTime: 2020-05-22 09:03
 */

//way one. greedy from end to begin;
class Solution {
    public static int minCostClimbingStairs(int[] cost) {
        //means the ith need the mininum cost;
        int[] dp = new int[cost.length];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            if(i == cost.length - 1) {
                dp[i] = Math.min(cost[i] + dp[i - 2], dp[i - 1]);
            } else {
                dp[i] = Math.min(dp[i - 2], dp[i - 1]) + cost[i];
            }
        }
        return Math.min(dp[cost.length - 1], dp[cost.length - 2]);
    }

    public static void main(String[] args) {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        minCostClimbingStairs(cost);
    }
}