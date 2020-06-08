package L200_300.L213;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: L200_300.L213
 * @Author: PaulDeng
 * @CreateTime: 2020-05-24 09:46
 */

//class Solution {
//    public int rob(int[] nums) {
//        if (nums.length == 0 || nums == null) {
//           return 0;
//        }
//        if (nums.length == 1) {
//            return nums[0];
//        }
//        return Math.max(robHouse(1, nums.length - 1, nums),robHouse(0, nums.length - 2, nums));
//    }
//
//    private int robHouse(int i, int length, int[] nums) {
//        int pre1 = 0;
//        int pre2 = 0;
//        int cur = 0;
//        for (int j = i; j <= length; j++) {
//            cur = Math.max(pre2 + nums[j] , pre1);
//            pre2 = pre1;
//            pre1 = cur;
//        }
//        return cur;
//    }
//}

class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        return Math.max(robHouse(1, nums.length, nums),robHouse(0, nums.length - 1, nums));
    }

    private int robHouse(int i, int length, int[] nums) {
        int pre1 = 0;
        int pre2 = 0;
        int cur = 0;
        for (int j = i; j < length; j++) {
            cur = Math.max(pre2 + nums[j] , pre1);
            pre2 = pre1;
            pre1 = cur;
        }
        return cur;
    }
}