package L000_100.L042;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: L000_100.L042
 * @Author: PaulDeng
 * @CreateTime: 2020-05-14 21:36
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        int max = 0;
        int realMax = nums[0];
        for (int i = 0; i < nums.length; i++) {
            max += nums[i];
            if(max  < 0){
                max = 0;
                continue;
            }else {
                if (max > realMax) {
                    realMax = max;
                }
            }
        }
        return realMax;
    }
}
