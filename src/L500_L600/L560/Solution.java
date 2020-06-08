package L500_L600.L560;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: L500_L600.L509
 * @Author: PaulDeng
 * @CreateTime: 2020-05-23 08:33
 */
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int size = 1;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
}