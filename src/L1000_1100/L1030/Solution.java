package L1000_1100.L1030;

import java.util.Arrays;

class Solution {
    public static int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] array = new int[R*C][2];
        int insertVal = 0;
        int insertIndex = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                array[j*R + i][0] = i;
                array[j*R + i][1] = j;
            }
        }
        for (int i = 1; i < R*C; i++) {
            int x = array[i][0];
            int y = array[i][1];
            insertVal = Math.abs(x - r0) + Math.abs(y - c0);
            insertIndex = i - 1;
            while(insertIndex >= 0 && insertVal < Math.abs(array[insertIndex][0] -r0) + Math.abs(array[insertIndex][1] - c0)){
                array[insertIndex + 1][0] = array[insertIndex][0];
                array[insertIndex + 1][1] = array[insertIndex][1];
                insertIndex--;
            }
            array[insertIndex + 1][0] = x;
            array[insertIndex + 1][1] = y;
    }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(allCellsDistOrder(4,3,1,2)));;
    }
}

class SolutionTwo{
    public static void main(String[] args) {

    }

//    public static int[][] allCellsDistOrderTwo(int R, int C, int r0, int c0) {
//        return new in;
//    }
}