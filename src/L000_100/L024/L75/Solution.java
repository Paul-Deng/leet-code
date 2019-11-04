package L000_100.L024.L75;

import java.util.Arrays;

class Solution {
    public static void sortColors(int[] nums) {
        int num1 = 0;
        int num2 = 0;
        int location = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                nums[location++] = 0;
            }
            else if(nums[i] == 1){
                num1++;
            }else{
                num2++;
            }
        }
        for (int i = 0; i < num1; i++) {
            nums[location++] = 1;
        }
        for (int i = 0; i < num2; i++) {
            nums[location++] = 2;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,2,2,1,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
}
