package CSP;

import java.util.Scanner;

public class C201909_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nums = scanner.nextInt();
        int rows = scanner.nextInt();
        int allNum = 0;
        int max = 0;
        int flag = 0;
        int[][] arr = new int[nums][rows + 3];
        for (int i = 0; i < nums; i++) {
            arr[i][0] = scanner.nextInt();
            int singleNum = 0;
            for (int j = 1; j < rows + 1; j++) {
                arr[i][j] = scanner.nextInt();
                singleNum += arr[i][j];
            }
            arr[i][rows + 1] = -singleNum;
            arr[i][rows + 2] = arr[i][0] + singleNum;
            allNum += arr[i][rows + 2];
            if(arr[i][rows + 1] > max){
                max = arr[i][rows + 1];
                flag = i + 1;
            }
        }
        System.out.println(allNum + " " + flag + " " + max);
    }
}
