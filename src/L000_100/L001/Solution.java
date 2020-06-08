package L000_100.L001;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: L000_100.L001
 * @Author: PaulDeng
 * @CreateTime: 2020-05-22 10:03
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap hashMap = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            if (hashMap.containsKey(num)) {
                return new int[] {(int) hashMap.get(num), i };
            };
            hashMap.put(nums[i],i);
        }
        return null;
    }
}