package HW.N_CharacterNum;

import java.util.Scanner;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: HW.N_CharacterNum
 * @Author: PaulDeng
 * @CreateTime: 2020-05-15 18:21
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toUpperCase();
        char c = scanner.next().toUpperCase().charAt(0);
        char[] chars = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            if(c == chars[i]){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
