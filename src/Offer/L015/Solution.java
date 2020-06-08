package Offer.L015;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: Offer.L015
 * @Author: PaulDeng
 * @CreateTime: 2020-05-22 00:10
 */
public class Solution {
    // you need to treat n as an unsigned value  unsigned value use >>> not >>
    public int hammingWeight(int n) {
        int count = 0;
        while (n !=0){
            if ((n&1)==1) {
                count++;
            }
            n = n>>>1;
        }
        return count;
    }
}
