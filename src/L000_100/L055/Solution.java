package L000_100.L055;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: L000_100.L055
 * @Author: PaulDeng
 * @CreateTime: 2020-05-21 16:13
 */
public class Solution {
    public boolean canJump(int[] nums) {
        int endReachable = nums.length - 1;
        for (int i = nums.length - 1; i >= 0 ; i--) {
            if (nums[i] + i >= endReachable) {
                endReachable = i;
            }
        }
        return endReachable == 0;
    }
}
