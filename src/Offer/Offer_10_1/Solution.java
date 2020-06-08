package Offer.Offer_10_1;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: Offer.Offer_10_1
 * @Author: PaulDeng
 * @CreateTime: 2020-05-23 08:47
 */
class Solution {
    public int fib(int n) {
        if (n < 2){
            return n;
        }
        Long temp1 = 0L;
        Long temp2 = 1L;
        for (int i = 2; i <= n; i++) {
            Long temp = temp1 + temp2;
            temp1 = temp2;
            temp2 = temp;
        }
        return (int) (temp2 % 1000000007);
    }
}