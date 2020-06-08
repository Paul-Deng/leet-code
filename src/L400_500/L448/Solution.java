package L400_500.L448;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int location = Math.abs(nums[i]) - 1;
            if(nums[location] < 0){
                continue;
            }else{
                nums[location] *= -1;
            }
        }
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i] > 0){
                list.add(i+1);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> disappearedNumbers = findDisappearedNumbers(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(disappearedNumbers);
    }
}
