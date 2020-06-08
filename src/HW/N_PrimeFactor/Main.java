package HW.N_PrimeFactor;

import java.util.Scanner;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: HW.N_PrimeFactor
 * @Author: PaulDeng
 * @CreateTime: 2020-05-15 19:28
 */
public class Main {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        for (int i = 2; i <= number;) {
            if(number % i == 0){
                number = number / i;
                System.out.print(i + " ");
                continue;
            }
            if(i == number){
                System.out.print(i + " ");
                break;
            }
            i++;
        }
    }
}
