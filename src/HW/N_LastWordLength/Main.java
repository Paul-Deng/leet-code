package HW.N_LastWordLength;

import java.util.Scanner;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: HW.N_LastWordLength
 * @Author: PaulDeng
 * @CreateTime: 2020-05-15 18:58
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] s1 = s.split(" ");
        String str = s1[s1.length-1];
        char[] chars = str.toCharArray();
        System.out.println(chars.length);
    }
}
