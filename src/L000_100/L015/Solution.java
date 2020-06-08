package L000_100.L015;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: L000_100.L015
 * @Author: PaulDeng
 * @CreateTime: 2020-05-22 09:18
 */

////way one : enum  result: time-out
//class Solution {
//    public static List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> lists = new ArrayList<>();
//        HashMap<String,Integer> hashMap = new HashMap<>();
//        List<Integer> list ;
//        for (int i = 0; i < nums.length - 2; i++) {
//            for (int j = i + 1; j < nums.length -1 ; j++) {
//                for (int k = j + 1; k < nums.length; k++) {
//                    if (nums[i] + nums[j] + nums[k] == 0){
//                        int[] arr = {nums[i],nums[j],nums[k]};
//                        Arrays.sort(arr);
//                        String str = Arrays.toString(arr);
//                        if (!hashMap.containsKey(str)) {
//                            hashMap.put(str,1);
//                            list = Arrays.asList(nums[i],nums[j],nums[k]);
//                            lists.add(list);
//                        }
//                    }
//                }
//            }
//        }
//        return lists;
//    }
//
//    public static void main(String[] args) {
//        int[] nums = {-1, 0, 1, 2, -1, -4};
//        threeSum(nums);
//    }
//}

////way two : a + b = -c;
//class Solution {
//    public static List<List<Integer>> threeSum(int[] nums) {
//        HashMap<String,Integer> hashMap = new HashMap<>();
//        HashMap<Integer,Integer> sumMap = new HashMap<>();
//        List<List<Integer>> lists = new ArrayList<>();
//        List<Integer> list ;
//        for (int i = 0; i < nums.length; i++) {
//            if (!sumMap.containsKey(nums[i])) {
//                sumMap.put(nums[i],1);
//                continue;
//            }
//            Integer integer = sumMap.get(nums[i]);
//            sumMap.put(nums[i],integer + 1);
//        }
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                int sum = -(nums[i] + nums[j]);
//                if (sumMap.containsKey(sum)) {
//                    int count = sumMap.get(sum);
//                    if (sum == nums[i]) {
//                        count--;
//                    }
//                    if (sum == nums[j]) {
//                        count--;
//                    }
//                    if (count <= 0) {
//                        continue;
//                    }
//                    int[] arr = {nums[i],nums[j],sum};
//                    Arrays.sort(arr);
//                    String str = Arrays.toString(arr);
//                    if (!hashMap.containsKey(str)) {
//                        hashMap.put(str,1);
//                        list = Arrays.asList(nums[i], nums[j],sum);
//                        lists.add(list);
//                    }
//                }
//            }
//        }
//        return lists;
//    }
//        public static void main(String[] args) {
//        int[] nums = {-1, 0, 1, 2, -1, -4};
//        threeSum(nums);
//    }
//}

//way three
