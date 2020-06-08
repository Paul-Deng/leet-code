package L100_200.L198;

//>1.dp[i] represent the 0...i can get the max value
//>2.F[i] =
//class Solution {
//    public int rob(int[] nums) {
//        if ( nums == null || nums.length == 0) {
//            return 0;
//        }
//        int[][] dp = new int[nums.length][2];
//        dp[0][0] = 0;
//        dp[0][1] = nums[0];
//        for (int i = 1; i < nums.length ; i++) {
//            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
//            dp[i][1] = dp[i - 1][0] + nums[i];
//        }
//        return Math.max(dp[nums.length - 1][0],dp[nums.length - 1][1]);
//    }
//}

class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        //means the index day can get the max money;
        int[] dp =new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i],dp[i - 1]);
        }
        return dp[nums.length - 1];
    }
}