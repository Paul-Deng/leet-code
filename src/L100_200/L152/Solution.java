package L100_200.L152;

import java.util.Arrays;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: L100_200.L152
 * @Author: PaulDeng
 * @CreateTime: 2020-05-23 21:54
 */
class Solution {
    public static int maxProduct(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int[] number = new int[nums.length + 1];
        int iMax = 1;
        int iMin = 1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = iMax;
                iMax = iMin;
                iMin = temp;
            }
            iMax = Math.max(iMax * nums[i],nums[i]);
            iMin = Math.min(iMin * nums[i],nums[i]);

            max = Math.max(iMax,max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {2,-5,-2,-4,3};
        maxProduct(arr);
    }
}