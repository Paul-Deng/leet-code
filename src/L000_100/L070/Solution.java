package L000_100.L070;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: L000_100.L70
 * @Author: PaulDeng
 * @CreateTime: 2020-05-22 08:43
 */

//way one ,the n stair can be reached by n-1 stair use 1 step or by n-2 stair use 2;
//class Solution {
//    public int climbStairs(int n) {
//        if(n<=3){
//            return n;
//        }
//        int[] arr = {1,2,3};
//        for (int i = 4; i <= n; i++) {
//            arr[0] = arr[1];
//            arr[1] = arr[2];
//            arr[2] = arr[0] + arr[1];
//        }
//        return arr[2];
//    }
//}