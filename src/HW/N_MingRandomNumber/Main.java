package HW.N_MingRandomNumber;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: HW.N_MingRandomNumber
 * @Author: PaulDeng
 * @CreateTime: 2020-05-15 19:00
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int number = scanner.nextInt();
            int[] arr = new int[number];
            for (int i = 0; i < number; i++) {
                arr[i] = scanner.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[0]);
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] != arr[i - 1]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
