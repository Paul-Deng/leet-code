package L000_100.L053;


//way one : dp
//class Solution {
//    public int maxSubArray(int[] nums) {
//        if (nums.length == 1) {
//            return nums[0];
//        }
//        //the index nums can get the max number
//        int[] dp = new int[nums.length];
//        dp[0] = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            int pre = Math.max(dp[i - 1], 0);
//            dp[i] = pre + nums[i];
//        }
//        int res = Integer.MIN_VALUE;
//        for (int i = 0; i < dp.length; i++) {
//            res= Math.max(res,dp[i]);
//        }
//        return res;
//    }
//}

//way two : dp
class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i], nums[i] + dp[i - 1]);
        }
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < dp.length; i++) {
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}