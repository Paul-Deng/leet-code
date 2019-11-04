package L1100_1200.L1122;

import java.util.Arrays;

class Solution {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        int location = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = location; j < arr1.length; j++) {
                if(arr2[i] == arr1[j]){
                    move(arr1,j,location);
                    arr1[location] = arr2[i];
                    location++;
                }
            }
        }
        return arr1;
    }
    public static void move(int[] arr,int x ,int y){
        for (int i = x; i > y ; i--) {
            arr[i] = arr[i-1];
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {33,22,48,4,39,36,41,47,15,45};
        int[] arr2 = {22,33,48,4};
        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));

    }
}
