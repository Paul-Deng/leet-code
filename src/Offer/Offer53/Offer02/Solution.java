package Offer.Offer53.Offer02;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: Offer.Offer53.Offer02
 * @Author: PaulDeng
 * @CreateTime: 2020-05-23 17:20
 */

//way one : bit operation
//class Solution {
//    public int missingNumber(int[] nums) {
//        int count = 0;
//        for (int i = 0 ; i < nums.length; i++) {
//            count ^= i;
//            count ^= nums[i];
//        }
//        return count^= nums.length;
//    }
//}

//way two : binary search
class Solution {
    public int missingNumber(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == mid) {
                left = mid + 1;
            } else {
                 right = mid - 1;
            }
        }
        return left;
    }
}
