package L300_L400.L322;

import sun.security.x509.EDIPartyName;

import java.util.Arrays;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: L300_L400.L322
 * @Author: PaulDeng
 * @CreateTime: 2020-05-24 06:47
 */
class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return -1;
        }
        //can get the amount use the less;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp,amount + 1);
        dp[0] = 0;
        for (int i = 1; i <= amount ; i++) {
            for (int coin: coins) {
                if (i - coin < 0) {
                    continue;
                }
                dp[i] = Math.min(1 + dp[i - coin],dp[i]);
            }
        }
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }
}