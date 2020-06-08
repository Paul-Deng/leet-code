package LCP.LCP06;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: LCP.LCP06
 * @Author: PaulDeng
 * @CreateTime: 2020-05-22 15:45
 */
class Solution {
    public int minCount(int[] coins) {
        int count = 0;
        for (int i = 0; i < coins.length; i++) {
            count += coins[i] / 2 + coins[i] % 2;
        }
        return count;
    }
}