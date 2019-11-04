package L400_500.L448;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            swap(nums,i ,nums[i] - 1);
        }
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i + 1){
                list.add(i+1);
            }
        }
        return list;
    }

    static int temp = 0;
    public static void swap(int[] arr, int x,int y){
        temp = arr[x];
        arr[x] =arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> disappearedNumbers = findDisappearedNumbers(arr);
        for (Integer disappearedNumber : disappearedNumbers) {
            System.out.println(disappearedNumber);
        }
    }
}
