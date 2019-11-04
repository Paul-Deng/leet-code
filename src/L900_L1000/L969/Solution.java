package L900_L1000.L969;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static List<Integer> pancakeSort(int[] A) {
        int reverse =  A.length;
        List<Integer> list = new ArrayList<>();
        for (int i = reverse - 1; i >= 0; i--) {
            if(A[i] == reverse){
                list.add(i + 1);
                pairSwap(A,i+1);
                list.add(reverse);
                pairSwap(A,reverse);
                reverse--;
                i = reverse;
            }
        }
        return list;
    }

    public static void pairSwap(int[] arr,int location){
        for (int i = 0; i < location/2 ; i++) {
            int temp = arr[location - 1 -i];
            arr[location - i -1] = arr[i];
            arr[i] = temp;
        }
    }

    public static void pairSwap(int[] arr){
        for (int i = 0; i < arr.length/2 ; i++) {
            int temp = arr[arr.length - 1 -i];
            arr[arr.length - i -1] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,2};
        // 4,3,1,2    3
        // 2,1,3,4    4
        // 3,1,2,4    3
        // 2,1,3,4    3
        // 2,1,3,4    1
        // 1,2,3,4    2
        // 1,2,3,4    1
        // 1,2,3,4    1
        System.out.println(pancakeSort(arr));
    }
}
