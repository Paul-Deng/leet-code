package HW.H_2016_bianli_002;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int number = scanner.nextInt();
            int[] array = new int[number];
            for (int i = 0; i < number; i++) {
                array[i] = scanner.nextInt();
            }

            Arrays.sort(array);
            for (int i = 0; i < number; i++) {
                if(i == 0 || array[i] != array[i - 1]){
                    System.out.println(array[i]);
                }
            }
        }
    }
}
