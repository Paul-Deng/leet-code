package CSP;

import java.util.Scanner;

public class C201909_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nums = scanner.nextInt();
        int[] arr = new int[nums];
        int temp = 0;
        int allSum = 0;
        int num = 0;
        int dropNum =0;
        for (int i = 0; i < nums ; i++) {
            int length = scanner.nextInt();
            int sum = scanner.nextInt();
            for (int j = 1; j < length; j++) {
                if((temp = scanner.nextInt()) > 0){
                    if(temp != sum){
                        sum = temp;
                        arr[i] = 1;
                    }
                }else{
                    sum += temp;
                }
            }
            allSum += sum;
        }
        for(int i = 0; i < nums; i++) {
            if(arr[i] == 1) {
                dropNum++;
                if(arr[(i + nums - 1) % nums]  == 1 && arr[(i + 1) % nums] == 1) {
                    num++;
                }
            }
        }


        System.out.println(allSum + " " + dropNum + " " + num);
    }
}
