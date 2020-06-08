package HW.N_CharactSplit;

import java.util.Scanner;

/**
 * @BelongsProject: leet-code
 * @BelongsPackage: HW.N_CharactSplit
 * @Author: PaulDeng
 * @CreateTime: 2020-05-15 19:15
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        if(!"".equals(str1)){
            char[] chars = str1.toCharArray();
            int size = chars.length/8;
            int length = chars.length % 8;
            for (int i = 0; i < size; i++) {
                System.out.println(str1.substring(i*8,(i+1)*8));
            }
            if(length != 0) {
                String last = str1.substring(size * 8);
                for (int i = 0; i < 8 - length; i++) {
                    last += "0";
                }
                System.out.println(last);
            }
        }
        if(!"".equals(str2)) {
            char[] chars = str2.toCharArray();
            int size = chars.length / 8;
            int length = chars.length % 8;
            for (int i = 0; i < size; i++) {
                System.out.println(str2.substring(i * 8, (i + 1) * 8));
            }
            if (length != 0) {
                String last = str2.substring(size * 8);
                for (int i = 0; i < 8 - length; i++) {
                    last += "0";
                }
                System.out.println(last);
            }
        }
    }
}
