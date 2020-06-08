package Offer.Offer_08.Offer01;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: Offer.Offer_08.Offer01
 * @Author: PaulDeng
 * @CreateTime: 2020-05-23 09:58
 */

//way one : DP
class Solution {
    public int waysToStep(int n) {
        Long[] count = new Long[4];
        count[0] = 1L;
        count[1] = 2L;
        count[2] = 4L;
        if(n <= 3){
            return (int) (count[n - 1]%1000000007);
        }
        for (int i = 4; i <= n; i++) {
            count[3] = (count[0] + count[1] + count[2]) % 1000000007;
            count[0] = count[1];
            count[1] = count[2];
            count[2] = count[3];
        }
        return (int) (count[3]%1000000007);
    }
}