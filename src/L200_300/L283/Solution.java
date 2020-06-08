package L200_300.L283;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: L200_300.L283
 * @Author: PaulDeng
 * @CreateTime: 2020-05-21 23:53
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        int nextIndexNotZero = 0;
        for (int i = 0; i <  nums.length; i++) {
            if (nums[i] != 0) {
                nums[nextIndexNotZero++] = nums[i];
                if (i != nextIndexNotZero) {
                    nums[i] = 0;
                }
            }
        }
    }
}
