package JX.JX_001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int ncount = n%2 + n/2;
        int mcount = m%2 + m/2;
        System.out.println(mcount*ncount);
    }
}
